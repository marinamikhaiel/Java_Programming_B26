package day08_relational_operators;

public class OperatorPractice2 {
    public static void main(String[] args) {
         int a = 40; // a=40 -> 39 ->38 ->37
        System.out.println(--a); //pre increment, subtract 1 right away, then it prints the value of a which is 39
        System.out.println(--a);//pre increment, subtract 1 right away, then it prints the value of a which is 38
        System.out.println(a--);//post increment, first get the current value of a, which is 38 and print it, then subtract 1
        System.out.println(--a);//pre increment, subtract 1 right away, then it prints the value of a which is 36
        System.out.println(--a);//pre increment, subtract 1 right away, then it prints the value of a which is 35
        System.out.println(a--);//post increment, first get the current value of a, which is 35 and print it, then subtract 1
    }
}
