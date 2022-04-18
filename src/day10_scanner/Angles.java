package day10_scanner;
import java.util.Scanner;
/*
Write a program that asks the user to enter 3 angle numbers ( can be floating numbers )
    Determine if the angles make a triangle, which means the angles add to 180.0
    and
    Determine if the angles make a circle, which means the angles add to 360.0

 */
public class Angles {
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);

        System.out.println( "Please enter 3 angle numbers. Hit enter after each one.");
        float ang1 = keyboard.nextFloat();
        float ang2 = keyboard.nextFloat();
        float ang3 = keyboard.nextFloat();

        boolean isTriangle= ang1+ang2+ang3 ==180;
        boolean isCircle= ang1+ang2+ang3 ==360;
//        double sum= ang1+ang2+ang3;
//        boolean isTriangle= sum ==180;
//        boolean isCircle= sum ==360;

        System.out.println( "Is it a Triangle? " +isTriangle);

        System.out.println( "Is it a circle? " + isCircle);

    }
}
