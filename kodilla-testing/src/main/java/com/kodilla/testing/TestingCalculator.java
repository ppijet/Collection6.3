package com.kodilla.testing;

import com.kodilla.testing.calkulator.Calculator;

public class TestingCalculator {

    public static void main(String[] args) {

        Calculator simpleCalculator = new Calculator();

        int addResult = simpleCalculator.addAtoB(8,5);

        if (addResult == 13) {
            System.out.println("wynik dodawania jest prawidłowy");
        } else {
            System.out.println("wynik błędny - idź zmień baterie !!!");
        }

        int subtractResult = simpleCalculator.subtractAFromB(8,5);

        if (subtractResult != 3) {
            System.out.println("odejmowanie lepiej idzie Mozartowi");
        } else {
            System.out.println("brawo !!! Twój kalkulator odwalił kawał dobrej robot przy odejmowaniu");
        }
    }
}
