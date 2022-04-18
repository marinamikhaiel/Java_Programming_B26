package day25_recap;

import java.util.Scanner;
import java.util.SplittableRandom;

public class ReverseMiddle {
    /*
    Reverse only second word [String, Loops]

Given a String with three words separated by spaces. Reverse only the second word and return the modified String
	Ex:
	I love java

	Ouput:
	I evol java
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 3 words sentence");
        String sent= in.nextLine().trim();

        int firstSpace=sent.indexOf(" ");
        int lastSpace= sent.lastIndexOf(" "); //sent.indexOf(" ",firstSpace+1);
        String middle=sent.substring(firstSpace+1,lastSpace);
        String reverse="";

        for (int i = middle.length()-1; i >= 0; i--) {
            reverse+= middle.charAt(i);


        }
        System.out.println(sent.substring(0,firstSpace+1)+ reverse+ sent.substring(lastSpace));
        System.out.println();
        System.out.println(sent.replace(middle,reverse));



        for (int i = 0; i <sent.length() ; i++) {

        }


    }
}
