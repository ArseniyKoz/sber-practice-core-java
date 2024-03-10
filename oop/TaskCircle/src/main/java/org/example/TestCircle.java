package org.example;

public class TestCircle {
    public static void main(String[] args){
        Circle c1 = new Circle(4, "Green");
        Circle c2 = new Circle(5, "Blue");
        Circle c3 = new Circle(1.51352, "Red");

        double areaC1 = c1.area();
        double areaC2 = c2.area();
        double areaC3 = c3.area();
        System.out.println("Площадь 1 круга: " + areaC1);
        System.out.println("Площадь 2 круга: " + areaC2);
        System.out.println("Площадь 3 круга: " + areaC3);
        System.out.println();


        double perC1 = c1.perimeter();
        double perC2 = c2.perimeter();
        double perC3 = c3.perimeter();
        System.out.println("Периметр 1 круга: " + perC1);
        System.out.println("Периметр 2 круга: " + perC2);
        System.out.println("Периметр 3 круга: " + perC3);
        System.out.println();

        c1.myToString();
        System.out.println();
        c2.myToString();
        System.out.println();
        c3.myToString();
    }
}
