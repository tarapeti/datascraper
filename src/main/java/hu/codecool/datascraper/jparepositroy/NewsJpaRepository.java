package hu.codecool.datascraper.jparepositroy;

import hu.codecool.datascraper.entity.News;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsJpaRepository extends CrudRepository<News, Integer> {

    List<News> findAll();
}
