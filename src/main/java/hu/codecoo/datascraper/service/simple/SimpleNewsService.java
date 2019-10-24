package hu.codecoo.datascraper.service.simple;

import hu.codecoo.datascraper.entity.News;
import hu.codecoo.datascraper.service.NewsService;
import org.springframework.stereotype.Service;

@Service
public class SimpleNewsService implements NewsService {
    @Override
    public News findById(int id) {
        return null;
    }
}
