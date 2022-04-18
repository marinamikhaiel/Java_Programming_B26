package day06_arithmetic_operators;

public class CastingExamples {
    public static void main(String[] args) {
        short numOne= 40;
        float numTwo = numOne; // short is smaller than float so no casting is needed from us

        System.out.println(numOne);
        System.out.println(numTwo);

        float numThree = 100.5f; // float is bigger than short, so i have cast float to short
        short numfour=(short) numThree;

        System.out.println(numThree);
        System.out.println(numfour);


        float num5 = 30;// 30 is int by default, at it automatically goes up to float
        byte num6= (byte)num5;


        System.out.println(num5);
        System.out.println(num6);


        char letter ='A';
        int letter2= letter;

        System.out.println(letter);
        System.out.println(letter2);
        System.out.println((int)letter);
        System.out.println((char)66);
    }



}
