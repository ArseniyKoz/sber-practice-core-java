package org.example;

public class Rectangle extends Figure implements Drawable{
    double width;
    double height;

    public Rectangle(Point point, double width, double height) {
        super(point);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public void draw() {
        System.out.print("Нарисован прямоугольник с координатами: ");
        System.out.print("(" + point.x  + "; " + point.y + "), ");
        System.out.print("(" + (point.x+ width) + ",;" + point.y + "), ");
        System.out.print("(" + point.x  + "; " + (point.y+height) + "), ");
        System.out.print("(" + (point.x+ width)  + "; " + (point.y+height)+ "\n");
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
        System.out.print("Нарисован " + c + " прямоугольник с координатами: ");
        System.out.print("(" + point.x  + "; " + point.y + "), ");
        System.out.print("(" + (point.x+ width) + "; " + point.y + "), ");
        System.out.print("(" + point.x  + "; " + (point.y+height) + "), ");
        System.out.print("(" + (point.x+ width)  + "; " + (point.y+height)+ "). \n");
    }
}
