package com.kodilla.exception.test;

public class FlightSearcherRunner {

    public static void main(String[] args) {

        FlightSearcher searcher = new FlightSearcher();
        boolean isFlyTime = false;

        try {
            isFlyTime = searcher.findFlight(new Flight("Bytom", "Warsaw"));

        } catch (RouteNotFoundException e) {
            System.out.println(e.routeNotFoundException());

        } finally {
            if (isFlyTime) {
                System.out.println("Thank's for choosing OLT Express");
            } else {
                System.out.println("Sorry you must change Airways ;-(");
            }
        }
    }
}