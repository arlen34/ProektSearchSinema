package com.company;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class FindClass implements FindAble {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void findMovieByName(List<Movie> movies) {
        System.out.println("Write movie's name: ");
        String movieName = scanner.nextLine();
        for (Movie movie : movies) {
            if (movieName.equals(movie.getName())) {
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
            }else {
                System.out.println("К сожелению не найдено!!!");
                break;
            }

        }
        System.out.println("-----------------------------------------");
    }

    @Override
    public void findMovieByActor(List<Movie> movies) {
        System.out.println("Write movie's actor name: ");
        String movieActor = scanner.nextLine();
        for (Movie movie : movies) {
            for (Cast cast : movie.getCasts()) {
                if (movieActor.equals(cast.getActor())) {
                    System.out.println("\n*******Фильм*******");
                    System.out.println("Actor: " + cast.getActor());
                    System.out.println("Role: " + cast.getRole());
                    System.out.println("Movie: " + movie.getName());
                    System.out.println("Year: " + movie.getYear());
                    System.out.println("Genre: " + movie.getGenre());
                    System.out.println("Director: " + movie.getDirector().getDirectorName() + " " +
                            movie.getDirector().getDirectorLastName());
                }
            }
        }
        System.out.println("------------------------------------------");
    }

    @Override
    public void findMovieByYear(List<Movie> movies) {
        System.out.println("Write movie's year: ");
        int movieYear = scanner.nextInt();
        for (Movie movie : movies) {
            if (movieYear == movie.getYear()) {
                System.out.println("\n*******Фильм*******");
                System.out.println("Year: " + movie.getYear());
                System.out.println("Movie: " + movie.getName());
                System.out.println("Genre: " + movie.getGenre());
                System.out.println("Director: " + movie.getDirector().getDirectorName() +
                        movie.getDirector().getDirectorLastName());
                System.out.println("******** Cast ********");
                for (Cast cast : movie.getCasts()) {
                    System.out.println("Actor: " + cast.getActor());
                    System.out.println("Role: " + cast.getRole());
                }
            }else {
                System.out.println("К сожелению не найдено!!!");
                break;
            }
        }
        System.out.println("---------------------------------------------");
    }

    @Override
    public void findMovieByDirector(List<Movie> movies) {
        System.out.println("Write movie's director name: ");
        String movieDirector = scanner.nextLine();
        for (Movie movie : movies) {
            if (movieDirector.equals(movie.getDirector().getDirectorName())) {//можно искать по имени режиссера
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
            if (movieDirector.equals(movie.getDirector().getDirectorLastName())) {//или по фамилию
                System.out.println("\n*******Фильм*******");
                System.out.println("Director: " + movie.getDirector().getDirectorLastName() + " " +
                        movie.getDirector().getDirectorName());
                System.out.println("Movie: " + movie.getName());
                System.out.println("Year: " + movie.getYear());
                System.out.println("Genre: " + movie.getGenre());

                System.out.println("******** Cast ********");
                for (Cast cast : movie.getCasts()) {
                    System.out.println("Actor: " + cast.getActor());
                    System.out.println("Role: " + cast.getRole());
                }
            }else {
                System.out.println("К сожелению не найдено!!!");
                break;
            }
        }System.out.println("---------------------------------------------");
    }

    @Override
    public void findMovieByGenre(List<Movie> movies) {
        System.out.println("Write movie's genre: ");
        String movieGenre = scanner.nextLine();
        for (Movie movie: movies){
            if (movieGenre.equals(movie.getGenre())){
                System.out.println("\n*******Фильм*******");
                System.out.println("Genre: " + movie.getGenre());
                System.out.println("Director: " + movie.getDirector().getDirectorName() + " " +
                        movie.getDirector().getDirectorLastName());
                System.out.println("Movie: " + movie.getName());
                System.out.println("Year: " + movie.getYear());
                System.out.println("******** Cast ********");
                for (Cast cast: movie.getCasts()){
                    System.out.println("Actor: " + cast.getActor());
                    System.out.println("Role: "+cast.getRole());
                }
            }else {
                System.out.println("К сожелению не найдено!!!");
                break;
            }
        }System.out.println("---------------------------------------------");
    }

    @Override
    public void findMovieByRole(List<Movie> movies) {
        System.out.println("Write the role of the movie's actor: ");
        String movieRole = scanner.nextLine();
        for (Movie movie: movies){
            for (Cast cast: movie.getCasts()){
                if (movieRole.equals(cast.getRole())){
                    System.out.println("\n*******Фильм*******");
                    System.out.println("Role: " + cast.getRole());
                    System.out.println("Movie: " + movie.getName());
                    System.out.println("Actor: " + cast.getActor());
                    System.out.println("Year: " + movie.getYear());
                    System.out.println("Genre: " + movie.getGenre());
                    System.out.println("Director: " + movie.getDirector().getDirectorName() + " " +
                            movie.getDirector().getDirectorLastName());
                }
            }
        }System.out.println("------------------------------------------");
    }
}
