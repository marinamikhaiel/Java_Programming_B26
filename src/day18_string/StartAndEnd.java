package day18_string;

public class StartAndEnd {
    public static void main(String[] args) {

        String str= "Apples";
        System.out.println(str.startsWith("APP"));// false
        System.out.println(str.startsWith("app"));// false

        System.out.println(str.startsWith("Apples"));// true

        String str2= "App";
        System.out.println(str.startsWith(str2));// does the String str start with the String str2
        System.out.println(str.startsWith(" App")); // false , space a character

        String sentence= "today was a good day";
        System.out.println(sentence+": "+ sentence.startsWith("today was a"));// true
        System.out.println(sentence+": "+ sentence.endsWith("day"));// true
        System.out.println(sentence+": "+ sentence.endsWith(" day"));// true
        System.out.println(sentence+": "+ sentence.endsWith("good"));// false
        System.out.println(sentence+": "+ sentence.endsWith("today was a good day"));

    }
}
