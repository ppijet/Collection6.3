package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MovieStoreRunner {

    public static void main (String[]args) {

        MovieStore movieStore = new MovieStore();

        String movie = movieStore.getMovies()
                .entrySet().stream()
                .map(map -> map.getValue())
                .flatMap(listOfMovie -> listOfMovie.stream())
                .collect(Collectors.joining(" ! ", ">>>", "<<<"));

        System.out.println(movie);

    }
}
