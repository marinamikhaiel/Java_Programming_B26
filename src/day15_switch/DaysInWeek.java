package day15_switch;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a day number: 1-7");
        int num= input.nextInt();
        String day1= "Monday";
        String day2= "Tuesday";
        String day3= "Wednesday";
        String day4= "Thursday";
        String day5= "Friday";
        String day6= "Saturday";
        String day7= "Sunday";

        switch (num){
            case 1:
                System.out.println(day1);
                break;
            case 2:
                System.out.println(day2);
                break;
            case 3:
                System.out.println(day3);
                break;
            case 4:
                System.out.println(day4);
                break;
            case 5:
                System.out.println(day5);
                break;
            case 6:
                System.out.println(day6);
                break;
            case 7:
                System.out.println(day7);
                break;
            default:
                System.out.println("Not a valid day");




        }

// different way to write it

        System.out.println("------------------------------------------");

        System.out.println("Enter a day number: 1-7");
        int numOfDay= input.nextInt();
        String day="";
        switch (numOfDay) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day= "Not a valid day";
        }
        System.out.println(day);

        }
}
