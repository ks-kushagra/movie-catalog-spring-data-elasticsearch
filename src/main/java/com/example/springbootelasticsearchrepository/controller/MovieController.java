package com.example.springbootelasticsearchrepository.controller;

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
        return movieservice.allMovie();
        
    }
    
    
    
    
    @GetMapping("/Movie/{moviename}")
    public List<Movie> getMovieByName(@PathVariable String moviename){
        return movieservice.findMovie(moviename);
    }
    
    
    
    @PostMapping("Movie/add")
    public String postMovie(@RequestBody Movie movie){
        System.out.println("Controller ----- > "+ movie);
        return movieservice.addMovie(movie);
    }
}
