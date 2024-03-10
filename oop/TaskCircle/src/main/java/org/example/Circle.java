package org.example;

public class Circle {
    double radius;
    String color;

    private static double pi = 3.14159265358979323846;
    public double area(){
        return pi*radius*radius;
    }
    public double perimeter(){
        return 2*pi*radius;
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public void myToString(){

        System.out.println("Информация по кругу: ");
        System.out.println("Радиус = " + radius);
        System.out.println("Цвет: " + color);
    }
}
