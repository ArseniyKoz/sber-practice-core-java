package org.example;

public class PaintExample {
    public static void main(String[] args){
        Point p1 = new Point(0, 0);
        Circle circle = new Circle(p1, 5.0);

        FigureUtil.draw(circle);
        FigureUtil.draw(circle, Color.RED);

        Point p2 = new Point(0, 0);
        Point p3 = new Point(5, 0);
        Point p4 = new Point(5, 5);
        Triangle triangle = new Triangle(p2, p3, p4);

        FigureUtil.draw(triangle);
        FigureUtil.draw(triangle, Color.GREEN);

        Square square = new Square(p2, 4);
        FigureUtil.draw(square);
        FigureUtil.draw(square, Color.PURPLE);
    }
}
