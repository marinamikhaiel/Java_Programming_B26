package day30_arrays;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {
        char[] letters={'j','a','v','a'};
        String word="java";
// converting a String to a char[]
        char[] java=word.toCharArray();
        System.out.println(Arrays.toString(letters));
        System.out.println(Arrays.toString(java));

        // print every letter in my String

        for (char eachChar:java){
            System.out.println(eachChar);




    }
// convert a char array to a String
        char[] day={'m','o','n','d','a','y'};
        System.out.println(day.length);

        String strDay=new String(day);
        System.out.println(strDay);
        System.out.println(strDay.toUpperCase());
        System.out.println(day);
      //  System.out.println(day.toUpperCase()); cannot use String methods on a char []


    }
}
