package com.company;

import java.util.Comparator;

public class ComparatorByMovieDirecter implements Comparator<Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getDirector().getDirectorName().compareTo(o2.getDirector().getDirectorName());
    }
}
