package day10_scanner;
/*
Ask the user to enter their age (byte),
ask them to enter their favorite number (long),
and ask them to enter their favorite book
Print all the values from the inputs

 */
 import java.util.Scanner;
public class YourInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print( " Enter your favorite book: ");
        String book= in.nextLine();

        System.out.print("What is your age? ");// using print will make the answer in the same line, println will make the answer in a new line
        byte age= in.nextByte();

        System.out.print(" What is your favorite number? ");
        long favoriteNumber = in.nextLong();

        System.out.println(book);
        System.out.println(age);
        System.out.println(favoriteNumber);





    }
}
