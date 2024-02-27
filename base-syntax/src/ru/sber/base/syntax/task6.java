package ru.sber.base.syntax;

import java.util.Random;
public class task6 {
    public static void main(String[] args) {
        Random r = new Random();
        int size = 100;
        int [] array = new int[size];
        int maxn = -1;
        int maxi = -1;
        int mean = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(1001);
            mean += array[i];
            if(array[i] > maxn){
                maxn = array[i];
                maxi = i;
            }
        }
        System.out.println("Максимальное значение = " + maxn +  " находится в элементе под индексом " + maxi);
        System.out.println("Среднее значение = " + mean/size);
    }
}
