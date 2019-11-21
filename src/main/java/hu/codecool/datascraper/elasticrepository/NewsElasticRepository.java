package hu.codecool.datascraper.elasticrepository;

import hu.codecool.datascraper.entity.News;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsElasticRepository extends ElasticsearchRepository<News, Integer> {

    List<News> findAll();


}
