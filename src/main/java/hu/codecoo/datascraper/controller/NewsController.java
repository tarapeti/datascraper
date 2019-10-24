package hu.codecoo.datascraper.controller;

import hu.codecoo.datascraper.entity.News;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NewsController {

    @GetMapping(path = "/getAllNews")
    @ResponseBody
    List<News> getAllNews() {
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
