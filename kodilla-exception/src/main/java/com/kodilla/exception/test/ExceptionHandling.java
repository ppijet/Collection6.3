package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main (String[]args) {

        SecondChallenge secondChallenge = new SecondChallenge();
        boolean checkStatus = false;
        try {
            String text = secondChallenge.probablyIWillThrowException(2.0,1.5);
            System.out.println(text);
            checkStatus = true;
        } catch (Exception a){
            System.out.println(a +" Invalid argument in method ");
        } finally {
            if (checkStatus) {
                System.out.println("The method works properly");
            } else {
                System.out.println("BOOT ERROR");
            }
        }
    }
}
