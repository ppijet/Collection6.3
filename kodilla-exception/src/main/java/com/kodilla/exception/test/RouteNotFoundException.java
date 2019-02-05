package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {

    public String routeNotFoundException(){

        return "Our line does not fly to this airport";
    }
}
