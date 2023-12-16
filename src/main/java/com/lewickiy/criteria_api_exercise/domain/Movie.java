package com.lewickiy.criteria_api_exercise.domain;

import java.time.LocalDate;
import java.util.List;

public class Movie {
    private String name;
    private Genre genre;
    private LocalDate premiere_date;
    private Actor director;
    private List<Actor> actors;
    private Rating rating;

    public Movie(String name, Genre genre, LocalDate premiere_date, Actor director, Rating rating) {
        this.name = name;
        this.genre = genre;
        this.premiere_date = premiere_date;
        this.director = director;
        this.rating = rating;
    }
}
