package com.company;

import java.util.Comparator;

public class ComparatorByMovieCast implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        for (Cast cast: o1.getCasts()){
            for (Cast cast1: o2.getCasts()){
               return cast.getActor().compareTo(cast1.getActor());
            }
        }
        return 0;
    }
}
