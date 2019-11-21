package hu.codecool.datascraper.controller;

import hu.codecool.datascraper.elasticrepository.NewsElasticRepository;
import hu.codecool.datascraper.entity.News;
import hu.codecool.datascraper.service.NewsService;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

@RestController
public class NewsController {

    @Autowired
    private NewsService newsService;

    @Autowired
    private RestHighLevelClient client;

    @Autowired
    private NewsElasticRepository newsElasticRepository;

    @GetMapping(path = "/test")
    @ResponseBody
    void getAllNews() throws IOException, ParseException {
        newsService.getHtml();
    }

    @PostMapping(path = "/getAll")
    @ResponseBody
    List<News> newNews(@RequestBody String vmi) throws IOException {
        return newsElasticRepository.findAll();
    }

    @DeleteMapping(path = "/deleteNews")
    public @ResponseBody
    void deleteNews(@RequestParam int id) {

    }
}
