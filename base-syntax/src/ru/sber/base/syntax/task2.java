package ru.sber.base.syntax;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        System.out.println("Введите количество чисел: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 1 || n > 500){
            System.out.println("Введено недопустимое число:" + n +". Допустимый диапазон значений: 1 - 500");
            return;
        }
        for(int i = 1; i <= n; i++){
            System.out.print(7 * i + ' ');
        }
    }
}
