package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide (double a, double b) throws ArithmeticException{

        if(b==0){
            throw new ArithmeticException();
        }
        return a/b;
    }

    public static void main(String[]args) {

        FirstChallenge firstChallenge = new FirstChallenge();
        boolean checkStatus = false;
        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
            checkStatus = true;
        } catch (ArithmeticException a) {
            System.out.println(a + ": Divide by 0 is impossible");
        } finally {
            if (checkStatus) {
                System.out.println("Task done correctly");
            } else {
                System.out.println("You should learn mathematics more");
            }
        }
    }
}
