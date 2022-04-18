package day19_string;

public class MergeStrings {
    public static void main(String[] args) {

        /*
        two strings: hard code to have 3 characters each
        merge the Strings together

        ex:
        abc
        xyz

        output: axbycz
         */
        String str= "hot";
        String str2= "RED";
        String merged= "";
        merged += str.charAt(0);
        merged += str2.charAt(0);
        merged += str.charAt(1);
        merged += str2.charAt(1);
        merged += str.charAt(2);
        merged += str2.charAt(2);


        System.out.println(merged);
    }
}
