package my_utilities;

import java.util.Arrays;

public class ArrayUtil {
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
    public static int maxNumber(int[]nums){
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
    /*
  Contains
  create a method that will accept an int array and an int number. Check and
  return if the given number is in the array.
   */
    public static boolean containArray(int[]nums, int element){
        for (int each:nums) {
            if (each==element){
                return true;
            }
        }
        return false;
    }

    public static int indexOf(String[] strs,String element){
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals(element)){
                return i;
            }
        }

        return -1;
    }

    public static int indexOf(int [] nums, int element){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==element){
                return i;
            }
        }

        return -1;
    }

}
