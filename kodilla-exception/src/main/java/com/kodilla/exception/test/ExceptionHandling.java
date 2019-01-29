package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main (String[]args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {String text = secondChallenge.probablyIWillThrowException(2.0,1.5);
        } catch (Exception a){
            System.out.println(a +" caused by probablyWillThrowException ");
        } finally { System.out.println("Remember >> Fuck PIS !!!<<");

        }
    }
}
