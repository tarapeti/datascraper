package hu.codecoo.datascraper.service.simple;

import hu.codecoo.datascraper.entity.News;
import hu.codecoo.datascraper.service.NewsService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class SimpleNewsService implements NewsService {
    @Override
    public void getHtml() throws IOException {
        Document doc = Jsoup.connect("https://www.bbc.com/news/10628494").get();
        Elements elementsByClass = doc.getElementsByClass("links-list").get(0).getAllElements();
        List<Element> elementsList = new ArrayList<>();
        for (Element e: elementsByClass) {
            if (e instanceof Element){
                elementsList.add(e);
            }
        }
    }
}
