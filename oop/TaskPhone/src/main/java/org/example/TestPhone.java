package org.example;

public class TestPhone {
    public static void main(String[] args){
        Phone phone1 = new Phone("+79845725303", "Sumsung galaxy s23", 14.43);
        Phone phone2 = new Phone("+78955344322", "iPhone");
        Phone phone3 = new Phone();

        String name = "Arseniy";
        Phone.receiveCall(name);
        System.out.println();

        phone1.getNumber();
        System.out.println();

        Phone.receiveCall(name, phone1.number);
        System.out.println();

        Phone[] phones = new Phone[5];
        for(int i = 0; i < 5; i++){
            String num = "+789553443" + i;
            phones[i] = new Phone(num, "iPhone");
        }

        Phone.sendMessage(phones);
        System.out.println();

        System.out.println(phone1.toString(1));

        System.out.println(phone2.toString(1));

        System.out.println(phone3.toString(1));
    }
}
