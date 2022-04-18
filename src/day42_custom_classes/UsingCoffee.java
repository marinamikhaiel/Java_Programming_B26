package day42_custom_classes;

import java.util.concurrent.Callable;

public class UsingCoffee {
    public static void main(String[] args) {

        Coffee coffee1=new Coffee();
        coffee1.brand="Starbucks";
        coffee1.size= 16;
        coffee1.price=4.29;
        coffee1.types="Latte";

        System.out.println(coffee1);
        coffee1.drink();
        coffee1.drink();
        coffee1.drink();
        coffee1.drink();

        coffee1.refill(8);
        System.out.println(coffee1);
    }
}
