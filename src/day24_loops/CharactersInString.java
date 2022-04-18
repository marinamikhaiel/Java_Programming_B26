package day24_loops;

import java.util.Scanner;

public class CharactersInString {
    /*
    Characters in String
Given a String print the ascii value codes for each character
Ex:
Input:
java
Output:
106 97 118 97
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a word");
        String word= in.nextLine();

        for (int i = 0; i < word.length(); i++) {

            System.out.print((int)word.charAt(i)+" ");// without the (int), it will print the letter of the word with a space in between


        }
    }
}
