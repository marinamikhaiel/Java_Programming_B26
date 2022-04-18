package day35__methods;

import java.util.Arrays;

public class MinNumberInArray {
    /*
    Min Number
create a method that will accept an int array and return the smallest
number from the array
     */
    public static int minNumber(int[]nums){
        int min=nums[0];
        for (int num:nums){
            if (num<min){
                min=num;
            }
        }
        return min;
    }
    public static int minNumberSort(int[]nums){
        Arrays.sort(nums);
        return nums[0];
    }

    /*
    Max Number
create a method that will accept an int array and return the largest
number from the array
     */
    public static int manNumber(int[]nums){
        int max=nums[0];
        for (int num:nums){
            if (num>max){
                max=num;
            }
        }
        return max;
    }
    public static int maxNumberSort(int[]nums){
        Arrays.sort(nums);
        return nums[nums.length-1];
    }
}
