package day29_arrays;

import java.util.Arrays;

public class ReverseArray {
/*
    Reverse Array
    Write a program that will reverse the order of any given array
    Ex: Input:
    [1, 2, 3, 4, 5]
    Output:
    [5, 4, 3, 2, 1]
     */
public static void main(String[] args) {
    int[]nums={1, 2, 3, 4, 5};
    int[] reverse= new int[nums.length];

//    for (int i = nums.length-1, j=0; i >0 ; i--,j++) {
//        reverse[j]=nums[i];
//    }

    for (int i = 0; i < nums.length; i++) {
        reverse[nums.length-1-i]=nums[i];
    }
        System.out.println(Arrays.toString(nums));
    System.out.println(Arrays.toString(reverse));


}


}
