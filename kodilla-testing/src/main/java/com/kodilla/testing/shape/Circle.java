package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {
    private String shapeName;
    private double radius;

    public Circle(double radius) {
        this.shapeName = "Circle";
        this.radius = radius;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        return Math.PI * radius * radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius &&
                getShapeName().equals(circle.getShapeName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getShapeName(), radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "shapeName='" + shapeName + '\'' +
                ", radius=" + radius +
                '}';
    }
}

