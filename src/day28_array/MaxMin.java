package day28_array;

import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[]num={100,120,-80,90,250,-10};
        System.out.println(Arrays.toString(num));
        int min=num[0];

        int max=num[0];

        for (int i = 0; i < num.length; i++) {
            int number = num[i];

            if (number > max) {// if (nums[i]>max)
                max = number; // max=nums[i]
            }else if (number < min) {// if (nums[i]<min)

                min = number; // min=nums[i]
            }
        }
        System.out.println("min: "+min);
        System.out.println("max: "+max);
    }
}
