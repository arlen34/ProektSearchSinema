package com.company;

import java.util.Comparator;
import java.util.List;

public class SortClass implements SortAble {

    @Override
    public void sortByMovieYear(List<Movie> movies) {
        movies.sort(Comparator.comparing(Movie::getYear));
        for (Movie movie : movies) {
            System.out.println("\n*******Фильм*******");
            System.out.println("Year: " + movie.getYear());
            System.out.println("Movie: " + movie.getName());
            System.out.println("Genre: " + movie.getGenre());
            System.out.println("Director: " + movie.getDirector().getDirectorName() + " " +
                    movie.getDirector().getDirectorLastName());
            System.out.println("******** Cast ********");
            for (Cast cast : movie.getCasts()) {
                System.out.println("Actor: " + cast.getActor());
                System.out.println("Role: " + cast.getRole());
            }
        }
    }

    @Override
    public void sortByMovieName(List<Movie> movies) {
        movies.sort(Comparator.comparing(Movie::getName));//comparator'дын ушундай кыска жолу,класс ачып кереги жок
//        ComparatorByMovieName comparatorByMovieName = new ComparatorByMovieName();//класс ачып дагы тузсо болот
//        movies.sort(comparatorByMovieName);
        for (Movie movie : movies) {
            System.out.println("\n*******Фильм*******");
            System.out.println("Movie: " + movie.getName());
            System.out.println("Year: " + movie.getYear());
            System.out.println("Genre: " + movie.getGenre());
            System.out.println("Director: " + movie.getDirector().getDirectorName() + " " +
                    movie.getDirector().getDirectorLastName());
            System.out.println("******** Cast ********");
            for (Cast cast : movie.getCasts()) {
                System.out.println("Actor: " + cast.getActor());
                System.out.println("Role: " + cast.getRole());
            }
        }
    }

    @Override
    public void sortByMovieNameDirector(List<Movie> movies) {
        ComparatorByMovieDirecter comparatorByMovieDirecter = new ComparatorByMovieDirecter();
        movies.sort(comparatorByMovieDirecter);
        for (Movie movie : movies) {
            System.out.println("\n*******Фильм*******");
            System.out.println("Director: " + movie.getDirector().getDirectorName() + " " +
                    movie.getDirector().getDirectorLastName());
            System.out.println("Movie: " + movie.getName());
            System.out.println("Year: " + movie.getYear());
            System.out.println("Genre: " + movie.getGenre());
            System.out.println("******** Cast ********");
            for (Cast cast : movie.getCasts()) {
                System.out.println("Actor: " + cast.getActor());
                System.out.println("Role: " + cast.getRole());
            }
        }
    }

    @Override
    public void sortByMovieCastName(List<Movie> movies) {
        ComparatorByMovieCast comparatorByMovieCast = new ComparatorByMovieCast();
        movies.sort(comparatorByMovieCast);
        for (Movie movie : movies) {
            for (Cast cast : movie.getCasts()) {
                System.out.println("\n*******Фильм*******");
                System.out.println("Actor: " + cast.getActor());
                System.out.println("Role: " + cast.getRole());
                System.out.println("Movie: " + movie.getName());
                System.out.println("Year: " + movie.getYear());
                System.out.println("Genre: " + movie.getGenre());
                System.out.println("Director: " + movie.getDirector().getDirectorName() + " " +
                        movie.getDirector().getDirectorLastName());
                //            List<Cast> casts = movie.getCasts();
//            casts.sort(Comparator.comparing(Cast::getActor).thenComparing(Cast::getRole));
//            for (Cast cast: casts){
//                System.out.println(cast);
//            }
            }
        }
    }
}


