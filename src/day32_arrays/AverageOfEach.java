package day32_arrays;

import java.util.Arrays;

public class AverageOfEach {
    public static void main(String[] args) {
        /*
        Given a 2D array find the average of each inner array
        and extra: average of the whole array
        ex:
        3, 4, 5, 6
        5, 2, 6
        10, 20, 30
         */

        int[][]nums={
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 20, 30}

        };
        double total=0;
        int totalLength=0;

       for (int[] inner:nums){
           double sum=0;
           for (int each:inner){
               sum+=each;


           }
           System.out.println(Arrays.toString(inner)+"the average is: "+(sum/inner.length));
           total+=sum;
           totalLength+=inner.length;

       }
        System.out.println("Average of the whole 2D array: "+(total/totalLength));

    }
}
