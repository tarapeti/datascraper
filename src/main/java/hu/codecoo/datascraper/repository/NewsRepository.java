package hu.codecoo.datascraper.repository;

import hu.codecoo.datascraper.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Integer> {

    News findById(int id);
}
