package com.kodilla.stream.beutifier;

public class PoemBeautifier {

    public String beautify (String text,PoemDecorator poemDecorator){

        String result = poemDecorator.decorate(text);

        System.out.println(result);

        return result;
    }
}
