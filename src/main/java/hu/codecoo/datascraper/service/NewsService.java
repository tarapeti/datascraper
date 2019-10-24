package hu.codecoo.datascraper.service;

import hu.codecoo.datascraper.entity.News;

import java.io.BufferedWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public interface NewsService {

    void getHtml() throws IOException;
}
