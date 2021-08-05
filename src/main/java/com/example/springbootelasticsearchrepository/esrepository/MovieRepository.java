/*
 * This is the repository Interface
 */
package com.example.springbootelasticsearchrepository.esrepository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import com.example.springbootelasticsearchrepository.model.Movie;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * ElasticsearchRepository is an interface but we don't use implements
 * An interface can extend any number of interfaces but one interface cannot
 * implement another interface, because if any interface is implemented then 
 * its methods must be defined and interface never has the definition of any method.
 * @author Kushagra
 */

@Repository
public interface MovieRepository extends ElasticsearchRepository<Movie , String> {
    
    List <Movie> findByNameContaining(String name);
}
