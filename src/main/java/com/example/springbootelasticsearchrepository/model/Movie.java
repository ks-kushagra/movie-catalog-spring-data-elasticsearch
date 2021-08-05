/*
This class is an entity class
*/
package com.example.springbootelasticsearchrepository.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;


@Document(indexName = "movie")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    
    @Id
    private String id;
    private String name;
    private String genre;
    private double rating;
}
