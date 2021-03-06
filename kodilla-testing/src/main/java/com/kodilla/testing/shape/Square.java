package com.kodilla.testing.shape;

import java.util.Objects;

public class Square  implements Shape{
    private String shapeName;
    private double sideA;

    public Square(double sideA) {
        this.shapeName = "Square";
        this.sideA = sideA;
    }

    public String getShapeName(){
        return shapeName;
    }

    public double getField(){
        return sideA*sideA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return Double.compare(square.sideA, sideA) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA);
    }

    @Override
    public String toString() {
        return "Square{" +
                "shapeName='" + shapeName + '\'' +
                ", sideA=" + sideA +
                '}';
    }
}
