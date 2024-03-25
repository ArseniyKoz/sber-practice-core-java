package org.example;

public abstract class Figure {

    public Point point;

    public Figure(Point point) {
        this.point = point;
    }

    public abstract double area();

    public abstract double perimeter();
}
