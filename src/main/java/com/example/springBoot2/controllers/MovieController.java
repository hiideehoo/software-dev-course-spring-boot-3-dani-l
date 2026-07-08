package com.example.springBoot2.controllers;

import com.example.springBoot2.Repositories.MovieRepository;
import com.example.springBoot2.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    private final List<Movie> movies = List.of(
        new Movie("The Shawshank Redemption", "Frank Darabont", 1994, 142),
        new Movie("The Godfather", "Francis Ford Coppola", 1972, 175),
        new Movie("The Dark Knight", "Christopher Nolan", 2008, 152)
    );

    @GetMapping
    public List<Movie> getMovies() {
        return movies;
    }
}
