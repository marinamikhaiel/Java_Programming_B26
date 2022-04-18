package day25_recap;

import java.util.Locale;
import java.util.Scanner;

public class CamelCases {
    /*
    Camel Case

Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase

Ex:
	Today is SUNDAY
	Output:
	todayIsSunday
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your words");
        String str= in.nextLine().toLowerCase(Locale.ROOT);
        String camelCase= str.substring(0,1);

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i-1)==' '){
                camelCase+=str.substring(i,i+1).toUpperCase(Locale.ROOT);// (""+ str.charAt(i).toUpperCase().sub(i,i+1) is the same as charAt(i) but the types are different
            }else {
                camelCase+= str.charAt(i);//today
            }


        }

        System.out.println(camelCase);
    }

}
