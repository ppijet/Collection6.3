package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape{

    private double sideA;
    private double sideH;

    public Triangle(double sideA, double sideH) {
        this.sideA = sideA;
        this.sideH = sideH;
    }

    public String getShapeName(){
        return "Triangle";
    }
    public double getField(){
        return (sideA*sideH)/2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.sideA, sideA) == 0 &&
                Double.compare(triangle.sideH, sideH) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideH);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideH=" + sideH +
                '}';
    }
}
