package ru.sber.base.syntax;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class task4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();
        if(n <= 1){
            System.out.println("Нет.");
            return;
        }
        for(int i = 2; i <= sqrt(n); i++){
            if(n % i == 0){
                System.out.println("Нет.");
                return;
            }
        }
        System.out.println("Да.");
    }
}
