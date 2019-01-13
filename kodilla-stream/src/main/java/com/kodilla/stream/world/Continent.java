package com.kodilla.stream.world;

import java.util.ArrayList;

public final class Continent {

    private final ArrayList<Country> countriesList = new ArrayList<>();

    public void addCountry(Country country){

        countriesList.add(country);
    }

    public ArrayList<Country> getCountriesList() {
        return new ArrayList<>(countriesList);
    }
}
