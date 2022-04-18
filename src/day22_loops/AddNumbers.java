package day22_loops;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=1;
        int total=0;
        while (num<=5){
            System.out.println("Enter number "+num);
            num++;
           total+= input.nextInt();

        }
        System.out.println("total "+total);
    }
}
