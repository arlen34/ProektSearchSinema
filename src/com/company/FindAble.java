package com.company;

import java.util.List;

public interface FindAble {

    void  findMovieByName(List<Movie> movies);


    void  findMovieByActor(List<Movie> movies);


    void  findMovieByYear(List<Movie> movies);


    void  findMovieByDirector(List<Movie> movies);


    void  findMovieByGenre(List<Movie> movies);


    void  findMovieByRole(List<Movie> movies);
}
