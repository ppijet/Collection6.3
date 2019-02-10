package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieStore {

    public Map<String, List<String>> getMovies(){

        List<String> ironManTranslation = new ArrayList<>();

        ironManTranslation.add("Żelazny człowiek");
        ironManTranslation.add("Iron Man");

        List<String> avengersTranslation = new ArrayList<>();

        avengersTranslation.add("Mściciele");
        avengersTranslation.add("Avengers");

        List<String> flashTranslation = new ArrayList<>();

        flashTranslation.add("Błyskawica");
        flashTranslation.add("Flash");

        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();

        booksTitlesWithTranslations.put("IM", ironManTranslation);
        booksTitlesWithTranslations.put("AV", avengersTranslation);
        booksTitlesWithTranslations.put("FL", flashTranslation);

        return booksTitlesWithTranslations;
    }
}
