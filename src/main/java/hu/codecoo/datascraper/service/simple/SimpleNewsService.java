package hu.codecoo.datascraper.service.simple;

import hu.codecoo.datascraper.entity.News;
import hu.codecoo.datascraper.repository.NewsRepository;
import hu.codecoo.datascraper.service.NewsService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class SimpleNewsService implements NewsService {
    @Autowired
    private NewsRepository newsRepository;

    @Override
    public void getHtml() throws IOException, ParseException {
        Document doc = Jsoup.connect("https://www.bbc.com/news/10628494").get();

        Elements topics = doc.select("div.story-body > div:nth-child(6) > .links-list > li > a");

        List<String> topicNames = new ArrayList<>();
        List<String> ulrs = new ArrayList<>();
        for (Element e : topics) {
            topicNames.add(e.text());
            for (Attribute a : e.attributes()) {
                String url = a.getValue();
                ulrs.add(url);
            }
        }

        for (String url : ulrs) {
            Document subDoc = Jsoup.connect(url).get();

            Elements creationDate = subDoc.select("item > pubDate");
            List<String> datesUnderMainTopic = fetchElemets(creationDate);
            List<Long> dateInMilis = new ArrayList<>();
            for (String dateString : datesUnderMainTopic){
                SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
                Date date = format.parse(dateString.substring(5, 25));
                long time = date.getTime();
                dateInMilis.add(time);
            }

            Elements titles = subDoc.select("item > title");
            List<String> titlesUnderMainTopic = fetchElemets(titles);

            Elements links = subDoc.select("item > link");
            List<String> linksUnderMainTopic = fetchElemets(links);

            List<String> contents = new ArrayList<>();
            for ( String link : linksUnderMainTopic) {
                Document contentDoc = Jsoup.connect(link).get();
                Elements paragraphs = contentDoc.select("div.story-body__inner > p");
                String content = paragraphs.text();
                //if it only contains a video then the summary is needed
                if (content.equals("")){
                    Elements summary = contentDoc.select("div.vxp-media__summary > p");
                    String summaryText = summary.text();
                    contents.add(summaryText);
                }else {
                    contents.add(content);
                }
            }


            List<News> all = new ArrayList<>();
            for (int i = 0; i < datesUnderMainTopic.size(); i++) {
                all.add(new News(topicNames.get(i), contents.get(i), dateInMilis.get(i)));
            }
            newsRepository.saveAll(all);

        }
    }

    private List<String> fetchElemets(Elements elements) {
        List<String> elementsAsString = new ArrayList<>();
        for (Element e : elements) {
            String elementString = e.text();
            elementsAsString.add(elementString);
        }
        return elementsAsString;
    }
}
