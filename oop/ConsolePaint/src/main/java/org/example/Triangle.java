package org.example;

public class Triangle extends Figure implements Drawable{
    Point point2;
    Point point3;

    public Triangle(Point point, Point point2, Point point3) {
        super(point);
        this.point2 = point2;
        this.point3 = point3;
    }

    @Override
    public double area() {
        return 0.5*(point.x*(point2.y - point3.y) + point2.x*(point3.y - point.y) + point3.x*(point.y - point2.y));
    }

    @Override
    public double perimeter() {
        double ans = Math.sqrt((point.x - point2.x) * (point.x - point2.x) + (point.y - point2.y) * (point.y - point2.y)) +
                     Math.sqrt((point.x - point3.x) * (point.x - point3.x) + (point.y - point3.y) * (point.y - point3.y)) +
                     Math.sqrt((point3.x - point2.x) * (point3.x - point2.x) + (point3.y - point2.y) * (point3.y - point2.y)) ;
        return ans;
    }

    @Override
    public void draw() {
        System.out.println("Нарисован треугольник с координатами: (" + point.x + "; "+ point.y +"), " +
                                                                    " (" + point2.x + "; "+ point2.y +" ),"  +
                                                                    " (" + point3.x + "; "+ point3.y +" )");
    }

    @Override
    public void draw(Color color) {
        String c = "";
        switch (color){
            case RED -> c += "красный";
            case GREY -> c += "серый";
            case GREEN -> c += "зеленый";
            case PURPLE -> c += "фиолетовый";
            case LIGHTBLUE -> c += "голубой";
        }
        System.out.println("Нарисован " + c + " треугольник с координатами: (" + point.x + "; "+ point.y +"), " +
                " (" + point2.x + "; "+ point2.y +" ),"  +
                " (" + point3.x + "; "+ point3.y +" )");
    }
}
