package day23_Loops;

import java.util.Scanner;

public class PalindromeInterviewQ {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
       System.out.println("Enter Word");
        String s= input.nextLine();
        String reverse="";

        for (int i=s.length()-1; i>=0; i--){

            reverse+= s.charAt(i);

        }
        System.out.println("Reverse:"+reverse);
        if (s.equals(reverse)){
            System.out.println("Palindrome");

        }else {
            System.out.println("Not Palindrome");
        }
        System.out.println("ternary:" + (s.equals(reverse)? "Palindrome" :"Not Palindrome") );


    }
}
