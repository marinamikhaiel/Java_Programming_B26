package day03_comments_escape_sequance;

public class Quotes {

    public static void main(String[] args) {
        /*
        Q: How can you output this:

        I like "java" programming
         */

        System.out.println("I like \"java\" programming");
        System.out.println("\"This is a quote\"");

        /*
        the first quote is before java printing the text(green)
        the second quote is to print the " quotation mark in the console
         */

        // I want to print backslash
        System.out.println("abs\\def");
        System.out.println("abs\\\\def");
    }
}
