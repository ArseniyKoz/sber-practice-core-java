package org.example;

public class Phone {
    String number;
    String model;
    double weight;

    public static void receiveCall(String name){
        System.out.println("Звонит " + name);
    }
    public void getNumber(){
        System.out.println("Номер телефона: " + number);
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone() {

    }

    public static void receiveCall(String name, String number){
        System.out.println("Звонит " + name);
        System.out.println(number);
    }

    public static void sendMessage(Phone[] Phones){
        for(int i = 0; i < Phones.length; i++){
            Phones[i].getNumber();
        }
    }

    public String toString(int i){
        return "Информация о телефоне: \t" + this.number + "\t"+ this.model + "\t"+ this.weight + "\t";
    }
}
