package day17_string;

public class StringMethod {
    public static void main(String[] args) {

        String name= "james";
// how to compare value--->   use .equals()
        System.out.println(name.equals("james"));
        System.out.println(name.equals("James"));
        System.out.println("cate".equals("dog"));

        String a = new String("hello");
        String b = new String("hello");
        System.out.println(a.equals(b));
        System.out.println(a.equals("hello"));
        System.out.println(name.length());

        String last= "today was fun";
        System.out.println(last.length());
        System.out.println(last.equals("today"));
        System.out.println(last.equalsIgnoreCase("TODAY WAS FUN"));
    }



}
