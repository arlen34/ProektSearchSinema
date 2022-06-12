package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Режиссеры
        Director director1 = new Director("Арлен", "Кубанычбеков");
        Director director2 = new Director("Эйрос", "Лин");
        Director director3 = new Director("Сэм", "Рейми");
        Director director4 = new Director("Рубен", "Флейшер");
        Director director5 = new Director("Джон", "Уоттс");
        Director director6 = new Director("Ави", "Арад");


        //Актеры
        List<Cast> casts1 = new ArrayList<>();
        casts1.add(new Cast("Дениел Редклифф", "Гари Поттер"));

        List<Cast> casts2 = new ArrayList<>();
        casts2.add(new Cast("Бенедикт Камбербэтч", "шерлок холмс"));

        List<Cast> casts3 = new ArrayList<>();
        casts3.add(new Cast("Бенедикт Камбербэтч", "доктор стрендж"));

        List<Cast> casts4 = new ArrayList<>();
        casts4.add(new Cast("Том Холланд", "Нейтан Дрейк"));

        List<Cast> casts5 = new ArrayList<>();
        casts5.add(new Cast("Том Холланд", "Питер Паркер"));

        List<Cast> casts6 = new ArrayList<>();
        casts6.add(new Cast("Роберт Дауни-младший", "Тони Страрк"));


        //фильмы
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Гарри Поттер", 2011, "фантастика", director1, casts1));
        movies.add(new Movie("Шерлок Холмс", 2011, "детектив", director2, casts2));
        movies.add(new Movie("Доктор Стрэндж: В мультивселенной безумия", 2022, "ужасы, фантастика", director3, casts3));
        movies.add(new Movie("Анчартед: На картах не значитс", 2022, "приключения, боевик", director4, casts4));
        movies.add(new Movie("Человек-паук: Нет пути домой", 2021, "супергеройский боевик", director5, casts5));
        movies.add(new Movie("Железный Человек", 2008, "экшн", director6, casts6));


        //Действия
        FindAble findAble = new FindClass();
        SortAble sortAble = new SortClass();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            menuMethod();
            int findSortMovie = scanner.nextInt();
                switch (findSortMovie) {
                    case 1 -> findAble.findMovieByName(movies);
                    case 2 -> findAble.findMovieByActor(movies);
                    case 3 -> findAble.findMovieByYear(movies);
                    case 4 -> findAble.findMovieByDirector(movies);
                    case 5 -> findAble.findMovieByGenre(movies);
                    case 6 -> findAble.findMovieByRole(movies);
                    case 7 -> sortAble.sortByMovieYear(movies);
                    case 8 -> sortAble.sortByMovieName(movies);
                    case 9 -> sortAble.sortByMovieNameDirector(movies);
                    case 10 -> sortAble.sortByMovieCastName(movies);
                    default -> System.out.println("Введите от 1 до 10,\nниже указан меню.");
                }
            }
        }
//        while (true){
//            menuMethod();
//            scanner.nextInt();
//        }

    static void menuMethod() {
        //меню
        System.out.println("\n~~~~~~~~ПОИСК ФИЛЬМОВ~~~~~~~");
        System.out.println("1.Искать фильмы по названиям.");
        System.out.println("2.Искать через имена актеров.");
        System.out.println("3.Искать фильмы через годы выпуска.");
        System.out.println("4.Искать фильмы через режиссера.");
        System.out.println("5.Искать фильмы по жанрам.");
        System.out.println("6.Искать фильмы по ролям актеры.");
        System.out.println("~~~~~~~~Сортировать фильмы~~~~~~~~~");
        System.out.println("7.Сортировать по году выпуска фильмов.");
        System.out.println("8.Сортировать по названию.");
        System.out.println("9.Сортировать по режиссеру.");
        System.out.println("10.Сортировать по имени актера.");
    }
}
