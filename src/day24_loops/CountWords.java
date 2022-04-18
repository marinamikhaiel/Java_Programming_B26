package day24_loops;

import java.util.Scanner;

public class CountWords {
    /*
    Count Words
Given a sentence determine how many words are in the String.
Ex:
Input:
This has multiple words
Output:
4
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence= input.nextLine().trim(); //remove the space in the beginning and end
        int spaces=0;

        for (int i = 0; i < sentence.length() ; i++) {
            if (sentence.charAt(i)==' '){
                spaces++;

            }

        }

        System.out.println("Number of words: " + (spaces+1));


    }
}
