package day15_switch;

import java.util.Scanner;

public class Starbucks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Starbucks. What size coffee would you like?");
        String size= in.nextLine();
        double price=0;
        int calories=0;
        boolean validOrder= true; // by making it true, i pick that all orders are valid, when i have an invalid order i will change the value.

        switch ( size){
            case "tall":

                price=2.50;
                calories=100;
                break;
            case "grande":
                price=4.00;
                calories=150;
                break;
            case "venti":
                price=4.50;
                calories=200;
                break;
            default:
                System.out.println("Sorry, we don't have that size");
                validOrder=false;
        }

        if (validOrder) {
            System.out.println("Your order for a " +size+" coffee is $"+price+ " and has "+calories+ " calories");
        }







    }

}
