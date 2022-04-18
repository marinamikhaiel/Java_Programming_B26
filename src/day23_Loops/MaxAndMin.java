package day23_Loops;

import java.util.Scanner;

public class MaxAndMin {
    /*
    write a program that asks user to enter 5 numbers and returns the biggest and smallest numbers from those 5

repeated steps:
    ask for number
    check is it the biggest
    check is it the smallest

     */
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int max=-2147483648;// just put these number instead of 0
        int min=214748364;// just put these number instead of 0

        int iteration=0;
        while (iteration<5){
            iteration++;

            System.out.println("Enter a number");
            int num= in.nextInt();
            if (num>max){
                max=num;
            }
            if (num<min){
                min=num;
            }
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);



    }
}
