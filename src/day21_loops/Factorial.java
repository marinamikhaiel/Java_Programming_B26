package day21_loops;

public class Factorial {
    public static void main(String[] args) {

/*
5!=5*4*3*2*1
repeated action: multiply the numbers
stopping point: number gets to 1
 */
    int n= 5;
    int result = 1;


    while (n>1){
        System.out.println(result+ " * "+n);
        result *= n;
        n--;


    }
    System.out.print(result);
}
 }