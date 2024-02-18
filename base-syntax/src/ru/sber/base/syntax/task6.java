package ru.sber.base.syntax;

import java.lang.Math;
import java.util.Random;
public class task6 {
    public static void main(String[] args) {
        Random r = new Random();
        int [] array = new int[100];
        int maxn = -1;
        int maxi = -1;
        int mean = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(1000);
            mean += array[i];
            if(array[i] > maxn){
                maxn = array[i];
                maxi = i;
            }
        }
        System.out.println("Максимальное значение = " + maxn +  " находится в элементе под индексом " + maxi);
        System.out.println("Среднее значение = " + mean/100);
    }
}
