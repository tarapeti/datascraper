package hu.codecool.datascraper.service;

import hu.codecool.datascraper.entity.News;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public interface NewsService {

    void getHtml() throws IOException, ParseException;

    List<News> getAll();
}
