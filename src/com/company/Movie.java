package com.company;

import lombok.*;

import java.util.List;

@Data
public class Movie {
    private String name;
    private int year;
    private String genre;
    private Director director;
    private List<Cast> casts;

    public Movie(String name, int year, String genre, Director director, List<Cast> casts) {
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.director = director;
        this.casts = casts;
    }

}
