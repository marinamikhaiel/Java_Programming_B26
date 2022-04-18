package day30_arrays;

import java.util.Arrays;

public class SplitExamples {
    public static void main(String[] args) {

        String s= "monday,tuesday,wednesday,thursday,friday,saturday,sunday";
        String[]days=s.split(",");
        System.out.println(Arrays.toString(days));


        for (String day:days){
            System.out.println(day);
        }

        System.out.println();
        String[]withOutDay=s.split("day");
        System.out.println(Arrays.toString(withOutDay));

        for (String eachDay:withOutDay){
            System.out.println(eachDay);

        }


        System.out.println();
        String str="jan-Feb-Mar-Apr-May-Jun-Jul-Aug-Sep-Oct-Nov-Dec";
        String[]month=str.split("-");
        System.out.println(Arrays.toString(month));

        for (String each:month) {
            System.out.println(each);

        }

    }

}
