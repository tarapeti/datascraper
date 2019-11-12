package hu.codecool.datascraper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={ElasticsearchAutoConfiguration.class, RestClientAutoConfiguration.class})
@EnableElasticsearchRepositories(basePackages = "hu.codecool.datascraper.repository")
@EnableJpaRepositories(basePackages = {"hu.codecool.datascraper.jparepositroy"})
public class DatascraperApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatascraperApplication.class, args);
	}

}
