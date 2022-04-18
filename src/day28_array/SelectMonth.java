package day28_array;

import java.util.Arrays;
import java.util.Scanner;

public class SelectMonth {

    /*
    ask the user the month number they want, print the month name

    1----- january
    2----- december

    assume only valid numbers are given but as a challenge you can handle invalid numbers

     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Which month number do you want");
        int mon= input.nextInt();

        String []month= {"January","February", "March", "April","May","June","July","August","September","October","November","December"};

        System.out.println(month [mon-1]);
    }





}
