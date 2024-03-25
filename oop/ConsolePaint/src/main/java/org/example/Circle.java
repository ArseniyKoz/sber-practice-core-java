package org.example;

import java.util.*;

public class Circle extends Figure implements Drawable{
    double radius;

    public Circle(Point point, double radius) {
        super(point);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.println("Нарисована окружность с точкой (" + point.x + "; " + point.y + ") и радиусом " + radius );
    }

    @Override
    public void draw(Color color) {
        String c = "";
        switch (color){
            case RED -> c += "красная";
            case GREY -> c += "серая";
            case GREEN -> c += "зеленая";
            case PURPLE -> c += "фиолетовая";
            case LIGHTBLUE -> c += "голубая";
        }
        System.out.println("Нарисована " + c + " окружность с точкой (" + point.x + "; " + point.y + ") и радиусом " + radius );
    }
}
