package day19_string;

import java.util.Locale;
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
 /*
            Ask the user to enter their first name
            Ask the user to enter their last name
            Print the initials as uppercase letters

            james
            bond
            JB
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName= input.next().toUpperCase(Locale.ROOT);
        System.out.println("Enter your last name");
        String lastName= input.next().toUpperCase(Locale.ROOT);


        System.out.println(""+firstName.charAt(0)+lastName.charAt(0));// space in the beginning to make sure it shows letters and not number value





    }
}
