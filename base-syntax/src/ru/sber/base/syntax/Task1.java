package ru.sber.base.syntax;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        System.out.println("Введите Ваше имя:");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println("Hello " + a);
    }
}
