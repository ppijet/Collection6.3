package com.kodilla.exception.test;

public class FlightSearcherRunner {

    public static void main (String [] args){

        FlightSearcher searcher = new FlightSearcher();
        boolean checkStatus = false;
        try {
            searcher.findFlight(new Flight ("Bytom" ,"Warsaw"));
            checkStatus = true;

        } catch (RouteNotFoundException e) {
            System.out.println(e.routeNotFoundException());

        } finally {
            if (checkStatus) {
                System.out.println("Thank's for choosing OLT Express");
            } else {
                System.out.println("You have to change airlines");
            }
        }
    }
}
