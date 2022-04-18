package day24_loops;

import java.util.Scanner;

public class Syllables {
    /*
    Given a String separated by dashes calculate how many syllables the
words are
Ex:
Input:
ja-va
Output:
2

     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a word");
        String word= in.next();
        int dashes= 1;// by default one word will have at least 1 syllables

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '-') {
                dashes++;

            }
        }

        System.out.println("Number of Syllables: " +dashes);

    }
}
