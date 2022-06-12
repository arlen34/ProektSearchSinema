package com.company;

import java.util.List;

public interface SortAble {
    void sortByMovieYear(List<Movie> movies);
    void sortByMovieName(List<Movie> movies);
    void sortByMovieNameDirector(List<Movie> movies);

    void sortByMovieCastName(List<Movie> movies);
}
