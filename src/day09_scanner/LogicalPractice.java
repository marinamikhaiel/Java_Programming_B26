package day09_scanner;

public class LogicalPractice {
    public static void main(String[] args) {
       // check if n is between 1 and 10

        int n= 6;
        System.out.println( n>5); // true
        System.out.println( n<10); // true

        System.out.println(n> 5 && n < 10); // with && and both are true then the outcome is true
        System.out.println("---------------------------------------");
        int m= 2;
        System.out.println( m>5); // false
        System.out.println( m<10); // true

        System.out.println(m> 5 && m < 10);// true && false = false
        // with && and one is true and one is false then the outcome is false

        System.out.println("---------------------------------------");

        int T= 20;
        System.out.println( T>5); // true
        System.out.println( T<10); // false

        System.out.println(T> 5 && T < 10);//  false && true = false
        // with && and one is true and one is false then the outcome is false

        System.out.println("---------------------------------------");
        System.out.println(4>3|| false); // true || (or) false = true
        System.out.println(3>4|| false); // False || (or) false = false
        System.out.println("---------------------------------------");
        System.out.println(!false); // not false= true
        System.out.println(!true); // not true = false

    }


}
