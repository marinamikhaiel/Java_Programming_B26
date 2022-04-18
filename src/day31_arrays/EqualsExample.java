package day31_arrays;

import java.util.Arrays;

public class EqualsExample {
    public static void main(String[] args) {

        int[]a={1,2,3};
        int[]b={1,2,3};
        int[]c=a;

        System.out.println(a==b);// compares the "a" array with "b" array, they are different objects -- not the same
        System.out.println(Arrays.equals(a,b));
        System.out.println(a==c);// compares the "a" array with "c" array, they are both reference to the same array object

        boolean same= Arrays.equals(a,b);

        int [] d={3,2,1};
        System.out.println(Arrays.equals(a,d)); // the order of the element of the elements does matter




    }
}
