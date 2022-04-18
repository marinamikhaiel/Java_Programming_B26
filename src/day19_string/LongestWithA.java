package day19_string;

import java.util.Locale;
import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter 3 words and press enter after each word");
        String word1= input.next().toLowerCase(Locale.ROOT);// made it lowercase right away
        String word2= input.next().toLowerCase(Locale.ROOT);
        String word3= input.next().toLowerCase(Locale.ROOT);

        int oneLen= word1.length();
        int twoLen= word2.length();
        int threeLen= word3.length();

        if ((word1.contains("a")) && (oneLen>threeLen) && (oneLen>twoLen) ){
            System.out.println(word1+ " is the longest with a");
        }else if ((word2.contains("a")) && (twoLen>oneLen) && (twoLen>threeLen)){
            System.out.println(word2+ " is the longest with a");
        }else if ((word3.contains("a"))&& (threeLen>twoLen) && (threeLen>oneLen)) {
            System.out.println(word3+ " is the longest with a");
        }else {
            System.out.println("No single longest word with a");
        }
        /*
        this task didn't work as we wanted to be
        ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'

	Ex:
		"java"
		"mouse"
		"computer"

	Output: java

Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.
         */
    }
}


