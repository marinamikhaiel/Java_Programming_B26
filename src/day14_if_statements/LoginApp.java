package day14_if_statements;

import java.util.Scanner;

public class LoginApp {

    public static void main(String[] args) {

       /*inputs:
        declare and assign a 4 digit pin code
        declare and assign the last 4 digits of ssn: 1234

        declare and assign expected values for both
        example expected:
        pin: 1552
        ssn: 1234

        outputs:

        when the pincode and ssn match the expected print:
        Authentication successful

        when the pincode or ssn are not correct print:
        Authentication failed

        when the pincode was not correct print:
        incorrect pin code

        whent he ssn is not correct print:
        invalid ssn
                */
        int pinCode= 1552;
        int ssNumber= 1234;

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the 4 digits pin code");
        int pin= input.nextInt();
        System.out.println("Enter the last 4 digits of ssn");
        int ssn= input.nextInt();

        if (pin==pinCode && ssn==ssNumber){
            System.out.println("Authentication successful");
        }else
            System.out.println("Authentication failed");
         if (pin!=pinCode){
            System.out.println("incorrect pin code");
        }  if (ssn!=ssNumber){
            System.out.println("invalid ssn");

        }
/*
        int pinCode= 1552;
        int ssNumber= 1234;
        boolean validPin= pin==pinCode;
        boolean validSSN= ssn==ssNumber;

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the 4 digits pin code");
        int pin= input.nextInt();
        System.out.println("Enter the last 4 digits of ssn");
        int ssn= input.nextInt();

        if (validPin && validSSN){
            System.out.println("Authentication successful");
        }else
            System.out.println("Authentication failed");
        if (!validPin){
            System.out.println("incorrect pin code");
        }  if (!validSSN){
            System.out.println("invalid ssn");

        }*/

    }
}

