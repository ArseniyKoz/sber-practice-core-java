package ru.sber.base.syntax;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a = ");
        double a = sc.nextDouble();

        System.out.println("Введите b = ");
        double b = sc.nextDouble();

        System.out.println("Введите c = ");
        double c = sc.nextDouble();

        double d = b*b - 4*a*c;
        double ds = sqrt(d);

        if(d < 0){
            System.out.println("Нет корней");
        }else if(d == 0){
            System.out.println("x = " + (b * (-1))/(2*a));
        }else{
            System.out.println("x1 = " + (b * (-1) + ds)/(2*a));
            System.out.println("x2 = " + (b * (-1) - ds)/(2*a));
        }
    }
}
