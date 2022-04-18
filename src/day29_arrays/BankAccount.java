package day29_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        /*
        0-full name
        1- account type
        2- account number
        3- balance
         */

       String [] bankAccountOne={"Brad Smith","Checking", "1002145896", "100,000,000"};
        System.out.println("Whole Array: "+Arrays.toString(bankAccountOne));
        System.out.println(bankAccountOne.length);

        System.out.println("Name: "+ bankAccountOne[0]);
        System.out.println("Account type: "+ bankAccountOne[1]);
        System.out.println("Account number: "+ bankAccountOne[2]);
        System.out.println("Balance: "+ bankAccountOne[3]);

        String [] bankAccountTwo= new String[4];
        System.out.println("Whole Array: "+Arrays.toString(bankAccountTwo));
        bankAccountTwo[0]="Jamie Fox";
        bankAccountTwo[1]= "Savings";
        bankAccountTwo[2]="455276642";
        bankAccountTwo[3]="102,033,24";

        System.out.println("Whole Array: "+Arrays.toString(bankAccountTwo));

        String [] bankAccountThree= new String[4];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your fall name");
        String fullName=in.nextLine();
        bankAccountThree[0]=fullName;
        System.out.println("Enter your account type");
        bankAccountThree[1]= in.nextLine();
        System.out.println("Enter your account number");
        bankAccountThree[2]= in.nextLine();
        System.out.println("Enter your balance");
        bankAccountThree[3]= in.nextLine();
        System.out.println(Arrays.toString(bankAccountThree));

        String [] bankAccountFour= new String[4];
        String [] questions={"full name","account type","account number","balance"};


        for (int i = 0; i < bankAccountFour.length; i++) {
            System.out.println("Enter your "+questions[i]);
            bankAccountFour[i]=in.nextLine();

        }
        System.out.println(Arrays.toString(bankAccountFour));








    }
}
