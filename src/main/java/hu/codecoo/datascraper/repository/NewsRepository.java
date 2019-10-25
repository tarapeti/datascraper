package hu.codecoo.datascraper.repository;

import hu.codecoo.datascraper.entity.News;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NewsRepository extends CrudRepository<News, Integer> {

    News findById(int id);
    List<News> findAll();

}
