package hu.codecool.datascraper.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "article", type = "news")
public class News extends AbstractEntity<Integer> implements Serializable {

    private String header;

    private String content;

    private String created_at;
}
