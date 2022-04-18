package day32_arrays;

import java.util.Arrays;

public class AverageOfEachTraditional {
    public static void main(String[] args) {

        int[][]nums={
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 20, 30}

        };
        double total=0;
        int totalLength=0;

        for (int i = 0; i <nums.length ; i++) {// going through the 2D array

            double sum=0;
            for (int j = 0; j <nums[i].length ; j++) {

                sum+=nums[i][j];


            }
            System.out.println(Arrays.toString(nums[i])+"the average is: "+(sum/nums[i].length));
            total+=sum;
            totalLength+=nums[i].length;

        }
        System.out.println("Average of the whole 2D array: "+(total/totalLength));

        /*
        int[][]nums={
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 20, 30}

        };
        int i=0

            int j=0
            num[0][0]-->3
            int j=1
            num[0][1]-->4
            int j=2
            num[0][2]-->5
            int j=3
            num[0][3]-->6

         int i=1

            int j=0
            num[1][0]-->5
            int j=1
            num[1][1]-->2
            int j=2
            num[1][2]-->6


         */
    }
}

