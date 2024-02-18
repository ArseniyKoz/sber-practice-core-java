package ru.sber.base.syntax;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();
        if(n < 2 || n > 100){
            System.out.println("Введено недопустимое число:" + n +". Допустимый диапазон значений: 1 - 500");
            return;
        }
        int a = 1, b = 1, c;
        System.out.print(a + " " + b);
        for(int i = 2; i < n; i++){
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
