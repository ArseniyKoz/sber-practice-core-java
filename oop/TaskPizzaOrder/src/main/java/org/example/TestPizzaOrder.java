package org.example;


public class TestPizzaOrder {
    public static void main(String[] args){
        PizzaOrder order1 = new PizzaOrder("Аррива", Size.BIG,false, "Воровского 2");
        PizzaOrder order2 = new PizzaOrder("Четыре сыра", Size.SMALL,true, "Герцена 55a");

        order1.order();

        order1.order();

        order1.cancel();

        order1.cancel();

        System.out.println(order1.toString(1));

        System.out.println(order2.toString(1));
    }
}
