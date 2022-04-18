package day29_arrays;

import java.util.Arrays;

public class EvenOrOdd {
    /*
    Even and odd from array
    Write a program that can count the even and odd number from an array of integers
    Ex:
    Input: [4,1,3,12,5]
    Output: Even: 2
    Odd: 3
     */
    public static void main(String[] args) {

        int[]num={4,1,3,12,5};
        int even=0;
        int odd=0;
        String evenNum="";
        String oddNum="";
//        for (int i = 0; i < num.length; i++) {
//            if (num[i]%2==0){
//                even++;
//                evenNum+=num[i]+", ";
//            }else {
//                odd++;
//                oddNum+=num[i]+", ";
//            }
//        }

        for (int number:num) {
            if (number%2==0){
                even++;
                evenNum+=number+", ";
            }else {
                odd++;
                oddNum+=number+", ";
            }
        }


        System.out.println(Arrays.toString(num));
        System.out.println("Odd counter: "+odd);
        System.out.println("Odd numbers: "+oddNum);
        System.out.println("Even counter: "+even);
        System.out.println("Even numbers: "+evenNum);
    }
}
