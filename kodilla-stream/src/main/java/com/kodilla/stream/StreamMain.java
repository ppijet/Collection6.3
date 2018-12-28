package com.kodilla.stream;


import com.kodilla.stream.beutifier.PoemBeautifier;

public class StreamMain {

    public static void main(String[]args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Tottenham HotSpur", team -> "◄◄◄" + team + "►►►");
        poemBeautifier.beautify("Tottenham HotSpur", team ->  team + "®");
        poemBeautifier.beautify("Real Madrid", team -> '♚' + team);
        poemBeautifier.beautify("Raków Częstochowa", team -> team.toUpperCase());
        poemBeautifier.beautify("Skra Częstochowa", team -> team.toLowerCase());
        poemBeautifier.beautify("Ajax Amsterdam", team -> team.replace("Amsterdam","Częstochowa"));
    }
}
