package ru.sber.base.syntax;

import java.util.Scanner;
import java.util.Random;

public class task9 {
    public static char caps(char x){
        char ans = ' ';
        if((int) x < 90){
            ans = x;
        }else if ((int) x > 96){
            int cmp = (int) x - 32;
            ans = (char)cmp;
        }
        return ans;
    }
    public static void main(String[] args) {
        Random r = new Random();
        int charCode = r.nextInt(26) + 65;
        char target = (char) charCode;
        Scanner sc = new Scanner(System.in);
        char predict;
        //System.out.println(target);
        do{
            predict = sc.next().charAt(0);
            if(predict < 65 || predict > 122 || (predict < 96 && predict > 90)){
                System.out.println("Введен недопустимый символ" );
                continue;
            }
            predict = caps(predict);
            //System.out.println(predict);
            if(predict == target){
                System.out.println("Верно!");
            }else if(predict < target){
                System.out.println("Ищи букву, которая после ней в алфавите" );
            }
            else if(predict > target){
                System.out.println("Ищи букву, которая перед нее в алфавите");
            }
        }while(predict != target);
    }
}