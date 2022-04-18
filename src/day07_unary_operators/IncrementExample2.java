package day07_unary_operators;

public class IncrementExample2 {

    public static void main(String[] args) {
        int age= 20;
        System.out.println(age);//20
        System.out.println(age++); // 20 post increment will happen after
        System.out.println(age); //21

        System.out.println(age++);//21
        System.out.println(age);//22

        System.out.println(++age); // 23 pre incremented value increased by 1 right away

    }
}
