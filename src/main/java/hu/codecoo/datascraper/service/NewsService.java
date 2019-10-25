package hu.codecoo.datascraper.service;

import java.io.IOException;
import java.text.ParseException;

public interface NewsService {

    void getHtml() throws IOException, ParseException;
}
