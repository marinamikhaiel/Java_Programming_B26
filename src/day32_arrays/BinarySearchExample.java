package day32_arrays;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {

        int []a= {4, 10, 30, 100};
        System.out.println(Arrays.binarySearch(a,4));
        System.out.println(Arrays.binarySearch(a,100));
        System.out.println(Arrays.binarySearch(a,400));// not the array it comes after 100 so it's postions is 4+1 --> 5 so it will be -5
        System.out.println(Arrays.binarySearch(a,20));// not the array it comes after 10 so it's postions is 2+1 --> 3 so it will be -3
    }
}
