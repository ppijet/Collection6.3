package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearcher {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {


        Map<String, Boolean> departures = new HashMap<>();
        departures.put("Krakow", true);
        departures.put("Warsaw", false);
        departures.put("Radom", false);
        departures.put("Katowice", true);

        Boolean ourFlight = departures.get(flight.getDepartureAirport());

        if (ourFlight == null) {
            throw new RouteNotFoundException();
        }

        if (ourFlight) {
            System.out.println("Welcome on the board");

        } else {
            System.out.println("Change departure time");
        }

        return ourFlight;
    }
}
