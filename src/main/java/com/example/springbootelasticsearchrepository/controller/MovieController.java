package com.example.springbootelasticsearchrepository.controller;

import com.example.springbootelasticsearchrepository.logging.Logging;
import com.example.springbootelasticsearchrepository.model.Movie;
import com.example.springbootelasticsearchrepository.services.MovieServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class MovieController {
    
    @Autowired
    MovieServices movieservice;
    
    @GetMapping("/Movie")
    public List<Movie> getAllMovie(){
        Logging.logger.info("User Requested for All movies present in DB");
        return movieservice.allMovie();
        
    }
    
    
    
    
    @GetMapping("/Movie/{moviename}")
    public List<Movie> getMovieByName(@PathVariable String moviename){
        Logging.logger.info("User Rewuested for movie : "  + moviename);
        return movieservice.findMovie(moviename);
    }
    
    
    
    @PostMapping("Movie/add")
    public String postMovie(@RequestBody Movie movie){
        Logging.logger.info("User wants to add movie to DB --> " + movie );
        return movieservice.addMovie(movie);
    }
}
