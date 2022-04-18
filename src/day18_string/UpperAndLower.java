package day18_string;

import java.util.Locale;

public class UpperAndLower {
    public static void main(String[] args) {

        String str= "sNOw";
        System.out.println(str.toUpperCase(Locale.ROOT));// makes a  new version of str but the orginal is still the same and never changed
        System.out.println(str.toLowerCase(Locale.ROOT));
        System.out.println(str);

        String word= "HELLO";
        word= word.toLowerCase(Locale.ROOT);
        System.out.println(word);

        String word2= word+ "WORLD";
        System.out.println(word2);
        System.out.println(word);

        word += " new text"; // word= word + "new text
        System.out.println(word);

        String old= "mark";
        System.out.println(old);
        String newValue= old.toUpperCase(Locale.ROOT);
        System.out.println(newValue);

    }
}
