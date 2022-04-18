package day33_methods;

public class CountNumbers {
    /*
    count up to a certain number
    start from 0
    all the numbers until the number input

     */
    public static void count(int number) {
        for (int i = 0; i <= number; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        count(5);
        count(20);


        count(-100);
    }
}
