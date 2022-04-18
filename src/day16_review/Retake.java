package day16_review;

import java.util.Scanner;

public class Retake {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What was the grade");
        int grade= input.nextInt();
        System.out.println("Which attempt number is it");
        int attempt = input.nextInt();
        boolean validAttempts= attempt<4 && attempt>0; // true

        if(attempt==1){
            grade-=(grade*0.10);// grade= grade -(int)(grade*0.1);or grade *=0.90; or grade -= grade * 0.1
        }else if(attempt==2){
            grade-=(grade*0.20);
        }else if(attempt==3){
            grade-=(grade*0.35);
        }else{
            System.out.println("not valid attempt");
            // if you do it be assigning true by default, then here you would use validAttempt= false;
        }
        if (validAttempts){
            System.out.println("your final grade is "+grade);
        }
    }
}
/*
    create a class Retake

    declare and assign a grade variable
    declare and assign an attempt number

    Doing a retake for the assignment will reduce the grade by a percentage based on the number of attempts taken:

        If its the first attempt -> subtract 10%
        If its the second attempt -> subtract 20%
        If its the third attempt -> subtract 35%

     */