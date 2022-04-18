package day11_if_statements;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {


    /*Create a double value for the account balance.
    Create a double value for how much you want to withdraw

    Check the balance after the withdrawal
        if you tried to withdraw more money that you had in the account add a negative overdraft fee to the balance: -100

    In both cases print the remaining balance after withdrawing, with overdraft free applied if you went over

     */
        Scanner input = new Scanner(System.in);

        System.out.println("What is your balance");
        double balance = input.nextDouble();

        System.out.println("How much are you withdrawing");
        double withdraw = input.nextDouble();

//        double balance = 100; // hard coded version
//        double withdraw = 50;
        balance -= withdraw;

        if (balance < 0) {
            System.out.println(" Took out too much money, $100 overdraft applied");
            balance -= 100; // balance =balance -100

        }
        System.out.println("The final balance $" + balance);
    }
}