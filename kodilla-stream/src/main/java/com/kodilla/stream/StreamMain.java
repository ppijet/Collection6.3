package com.kodilla.stream;


import com.kodilla.stream.beutifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {

    public static void main(String[]args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Tottenham HotSpur", team -> "◄◄◄" + team + "►►►");
        poemBeautifier.beautify("Tottenham HotSpur", team ->  team + "®");
        poemBeautifier.beautify("Real Madrid", team -> '♚' + team);
        poemBeautifier.beautify("Raków Częstochowa", team -> team.toUpperCase());
        poemBeautifier.beautify("Skra Częstochowa", team -> team.toLowerCase());
        poemBeautifier.beautify("Ajax Amsterdam", team -> team.replace("Amsterdam","Częstochowa"));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
