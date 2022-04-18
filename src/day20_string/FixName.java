package day20_string;

import java.util.Locale;
import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first name");//     jaMES
        String firstName = input.next();
        System.out.println("Enter your last name");
        String lastName = input.next();

        firstName= firstName.trim().toLowerCase(Locale.ROOT);// james
        lastName =lastName.trim().toLowerCase(Locale.ROOT);

        String fixedFirst= firstName.substring(0,1).toUpperCase(Locale.ROOT);//J
        fixedFirst+=firstName.substring(1);// J+ames=James

        String fixedLast= lastName.substring(0,1).toUpperCase(Locale.ROOT)+ lastName.substring(1);

        System.out.println(fixedFirst+" "+fixedLast);



        //firstName.charAt(0)--> this will also give you the first character, but as a char type

    }

}
