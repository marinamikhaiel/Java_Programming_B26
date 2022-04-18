package day25_recap;

import java.util.Locale;
import java.util.Scanner;

public class CreateID {
    /*
    Create ID [String]

Given a first name and last name create and return an id using the following format:
	the first letter of the first name as lowercase,
	the first 3 letters of the last name with the first letter as uppercase and the rest lowercase,
	the length of the first String multiplied by 2

	first name: john
	last name: smith

	id: jSmi8

     */

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName= in.next().toLowerCase(Locale.ROOT);
        System.out.println("Enter your last name");
        String lastName= in.next().toLowerCase(Locale.ROOT);

        String id=firstName.substring(0,1);
        id+= lastName.substring(0,1).toUpperCase(Locale.ROOT);
        id+=lastName.substring(1,3);
        id+= firstName.length()*2;

        System.out.println(id);




    }
}
