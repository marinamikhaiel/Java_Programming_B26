package day07_unary_operators;

public class IncrementExample3 {
    public static void main(String[] args) {
/*
public static void main(String[] args) {

        int i = 5;
        int z = i++; // i = (i)+(1) = 6 // z = i++ = 5
        int y = z++;
        int w = y + z;
        int m = --y;
        int l = w++ + --m;

        System.out.println(i); // 6

        System.out.println(z); // 6
        System.out.println(y); //4
        System.out.println(z); // 6
        System.out.println(w); // 12
        System.out.println(m); // 3
        System.out.println(l); // 14
 */
        int i = 5; // 5
        int z = i++;// i = (i)+(1) = 6 // z = i++ = 5
        int y = z++;
        int w = y + z;
        int m = --y;
        int l = w++ + --m;

        System.out.println(i); // 6

        System.out.println(z); // 6
        System.out.println(y); //4
        System.out.println(z); // 6
        System.out.println(w); // 12
        System.out.println(m); // 3
        System.out.println(l); // 14

        System.out.println("******************************");

        int a= 10;
        int b= a+1;

        System.out.println(a);
        System.out.println(b);

        int c= ++a;

        System.out.println(c);
        System.out.println(a);
    }
}
