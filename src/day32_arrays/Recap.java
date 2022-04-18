package day32_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Recap {
    public static void main(String[] args) {
        int[] arr = {30, 90, 60, 360, 180};
        int[] arr2 = {180, 360, 30, 90, 60};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        System.out.println("Before sorting: " + Arrays.equals(arr, arr2));

        Arrays.sort(arr);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        System.out.println("After sorting: " + Arrays.equals(arr, arr2));

        String[] words = {"hello", "java", "Saturday"};
        System.out.println(String.join(" ### ", words));

        String str = "Today is Saturday";
        System.out.println(Arrays.toString(str.toCharArray()));

        System.out.println(Arrays.toString(str.split(" ")));


        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {

                System.out.print(i + " ");

            }
        }
        System.out.println();
        for (int j = 1; j <= 20; j++) {
            if (j % 2 == 1) {
                System.out.print(j + " ");


            }
        }
    }}
