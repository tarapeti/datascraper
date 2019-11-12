package hu.codecool.datascraper.controller;

import hu.codecool.datascraper.repository.NewsRepository;
import hu.codecool.datascraper.service.NewsService;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.text.ParseException;

@RestController
public class NewsController {

    @Autowired
    private NewsService newsService;

    @Autowired
    private RestHighLevelClient client;

    @Autowired
    private NewsRepository newsRepository;

    @GetMapping(path = "/test")
    @ResponseBody
    void getAllNews() throws IOException, ParseException {
        newsService.getHtml();
    }

    @PostMapping(path = "/getAll")
    @ResponseBody
    String newNews(@RequestBody String vmi) throws IOException {
        return vmi;
    }

    @DeleteMapping(path = "/deleteNews")
    public @ResponseBody
    void deleteNews(@RequestParam int id) {

    }
}
