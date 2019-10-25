package hu.codecoo.datascraper.controller;

import hu.codecoo.datascraper.entity.News;
import hu.codecoo.datascraper.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

@RestController
public class NewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping(path = "/test")
    @ResponseBody
    List<News> getAllNews() throws IOException, ParseException {
        newsService.getHtml();
        return null;
    }

    @PostMapping(path = "/addNews")
    @ResponseBody
    void newNews(@RequestBody News news) {

    }
    @DeleteMapping(path = "/deleteNews")
    public @ResponseBody
    void deleteNews(@RequestParam int id) {

    }
}
