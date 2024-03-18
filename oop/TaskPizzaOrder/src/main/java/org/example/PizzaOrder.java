package org.example;

import java.util.Scanner;

public class PizzaOrder {
    String label;
    Size size;
    boolean isSause = false;
    String address;
    static boolean isConfirm = false;
    public PizzaOrder(String label, Size size, boolean isSause, String address){
        this.label = label;
        this.size = size;
        this.isSause = isSause;
        this.address = address;
    }

    public void order(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Для подтверждения заказа введите: 'Заказ принят'");
        System.out.print(">>>");
        String ord = sc.nextLine();
        if (!ord.equals("Заказ принят")){
            System.out.println("Ввод неверный, попробуйте снова.");
        }else if(!isConfirm){
            isConfirm = true;
            String s = "";
            switch (size){
                case BIG -> s = "Большая пицца";
                case SMALL -> s = "Маленькая пицца";
                case MEDIUM -> s = "Средняя пицца";
            }
            String sause;
            if(isSause){
                sause = "с соусом";
            }else{
                sause = "без соуса";
            }
            System.out.println(s + " '" + label + "' " + sause + " по адресу " + address);
        }else{
            System.out.println("Заказ уже принят!");
        }
    }

    public void cancel(){
        if(isConfirm){
            isConfirm = false;
            System.out.println("Заказ отменен.");
        }else{
            System.out.println("Заказ не был принят.");
        }
    }

    public String getLabel(){
        return label;
    }
    public void setLabel(String label){
        this.label = label;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public Size getSize(){
        return size;
    }
    public void setSize(Size size){
        this.size = size;
    }
    public boolean getIsSause(){
        return isSause;
    }
    public void setIsSause(boolean isSause){
        this.isSause = isSause;
    }

    public String toString(int i){
        String s = "";
        switch (this.size){
            case BIG -> s = "Большая пицца";
            case SMALL -> s = "Маленькая пицца";
            case MEDIUM -> s = "Средняя пицца";
        }
        String sause;
        if(this.isSause){
            sause = "с соусом";
        }else{
            sause = "без соусом";
        }
        String ans = "";
        if(this.isConfirm){
            ans = "==============================\n";
            ans +=s + " '" + this.label + "' " + sause + " по адресу " + this.address + ", Заказ принят.\n";
            ans += "==============================\n";
        }else{
            ans = "==============================\n";
            ans += s + " '" + this.label + "' " + sause + " по адресу " + this.address + ", Заказ не принят.\n";
            ans += "==============================\n";
        }
        return ans;
    }
}
enum Size{
    SMALL,
    MEDIUM,
    BIG
};
