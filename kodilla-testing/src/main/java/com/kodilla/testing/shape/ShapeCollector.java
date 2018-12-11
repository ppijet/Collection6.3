package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector{

    private ArrayList<Shape> figuresList = new ArrayList<>();


    public void addFigure(Shape shape){

        figuresList.add(shape);
    }

    public boolean removeFigure(Shape shape){

        return figuresList.remove(shape);
    }

    public  Shape getFigure(int n){

        return figuresList.get(n);
    }

    public ArrayList<Shape> showFigures(){

        return figuresList;
    }
}
