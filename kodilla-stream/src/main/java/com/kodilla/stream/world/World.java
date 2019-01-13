package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;

public final class World {

    private final ArrayList<Continent> continentsList = new ArrayList<>();

    public void addContinent(Continent continent){
        continentsList.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        return continentsList.stream()
                .flatMap(continent -> continent.getCountriesList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum,current) -> sum = sum.add(current));
    }
}
