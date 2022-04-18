package day08_relational_operators;

public class OperatorPractice {
    public static void main(String[] args) {
        int b = 10; // b=10 -> 11 -> 10 ->11
        b++; // post increment
        System.out.println(b);//print the new value of b, which is 11
        b--; // post decrement
        System.out.println(b);//print the new value of b, which is 10
        System.out.println(b++); // post increment, we get the value first, which is 10 and we print it, then we add 1
        System.out.println(b++);  // post increment, we get the value first, which is 11 and we print it, then we add 1
        System.out.println(b);

    }
}
