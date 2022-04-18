package day32_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        /*
        have a starting array
        you want to add a number to the end
        so make your array bigger to store the new number
         */
        System.out.println("with scanner ");

        Scanner in=new Scanner(System.in);

        System.out.println("How many numbers do you want to start with");
        int size= in.nextInt();
        int[]nums=new int[size];

        for (int i = 0; i < nums.length; i++) {// the purpose of this loop is to get all the numbers for the array
            System.out.println("enter a number");
            nums[i]= in.nextInt();
        }

        System.out.println("Array do far: "+Arrays.toString(nums));
        int [] expanded= Arrays.copyOf(nums,nums.length+1);

        System.out.println("Enter the last number");
        expanded[expanded.length-1]=in.nextInt();
        System.out.println(Arrays.toString(expanded));


        System.out.println("-------------------------------");
        System.out.println(" with out scanner ");
        int[]a= {45, 123, 62};
        int[] z= (Arrays.copyOf(a,a.length+1));
        z[z.length-1]=100;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(z));

    }
}
