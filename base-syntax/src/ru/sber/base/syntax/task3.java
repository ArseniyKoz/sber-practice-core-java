package ru.sber.base.syntax;

public class task3 {
    public static void main(String[] args){
        for(int i = 0; i < 6; i++){
            if(i % 2 == 0){
                for(int j = 0; j < 10; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }else{
                for(int j = 0; j < 9; j++){
                    System.out.print(" *");
                }
                System.out.println();
            }
        }
    }
}
