package com.kodilla.good.patterns.challenges;

import java.util.Map;
import java.util.stream.Collectors;

public class MovieClassRunner {

    public static void main(String args[]) {

        MovieStar movieStar = new MovieStar();

        String resultList = movieStar.getMovies().entrySet().stream()
                .map(Map.Entry::getValue)
                .flatMap(list -> list.stream())
                .collect(Collectors.joining("! ", " ", " "));

        System.out.println(resultList);
    }
}
