package ru.sber.base.syntax;

import java.util.Random;

public class task8 {
    public static int[] bubleSort(int[] x){
        int cmp;
        for(int i = 0; i < x.length - 1; i++) {
            for(int j = 0; j < x.length - 1 - i; j++) {
                if(x[j] > x[j+1]) {
                    cmp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = cmp;
                }
            }
        }
        return x;
    }
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println("Начальный массив:");
        int [] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(1000);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Отсортированный массив:");
        array = bubleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
