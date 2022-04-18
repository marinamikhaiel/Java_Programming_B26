package day07_unary_operators;

public class IncrementExample {
    public static void main(String[] args) {

        int x = 0;
        System.out.println(x); // 0

        x=x+1; // reassigned
        System.out.println(x);

        x++; // post increment
        System.out.println(x);// incremented by 1

        ++x;// pre increment
        System.out.println(x);//3
        System.out.println(++x);// it's preincrement it will add 1 right away so 4 is printed

        System.out.println(x++);// statement is run first because it's a post increment, we will see 4

        System.out.println(x);

    }
}
