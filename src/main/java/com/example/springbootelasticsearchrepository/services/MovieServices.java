package com.example.springbootelasticsearchrepository.services;
/**
 * This class provides basic functionality to our Movie Database
 * Like , 
 * addMovie()
 * allMovie()
 * findMovie()
 */
import org.springframework.beans.factory.annotation.Autowired;
import com.example.springbootelasticsearchrepository.esrepository.MovieRepository;
import com.example.springbootelasticsearchrepository.model.Movie;
import java.util.Arrays;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;



@Service
public class MovieServices {
    
    @Autowired
     private MovieRepository movierepository;

    
    //save function throws IllegalArgumentException if Argument is NULL 
    //and returns nothing
    public String addMovie(Movie movie){
        System.out.println(movie);
        try{
        movierepository.save(movie);
        System.out.println("Movie saved");
        }catch(Exception e){
            System.out.println("Argument is NULL or getting another Excdeption");
        }
        return "Movie added";
    }
    
    //returns all movies
    public List<Movie> allMovie(){
        List <Movie> movies = (List <Movie>) (movierepository.findAll());
        return movies;
    }
    
    
    //finds movie by name
    public List<Movie> findMovie(@PathVariable String moviename){
        List <Movie> movies = (List <Movie>) (movierepository.findByNameContaining(moviename));
        return movies;
    }
    
}
