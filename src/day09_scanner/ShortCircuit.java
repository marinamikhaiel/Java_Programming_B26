package day09_scanner;

public class ShortCircuit {
    public static void main(String[] args) {

       // System.out.println(5/0); makes an issue can not divide by 0

        System.out.println( true || 5/0 == 0); // with ||(or) we got one ture so right away the answer is true regardless.
       // System.out.println( true | 5/0 == 0); error
        System.out.println( false && 5/0 == 0);
        //System.out.println( false & 5/0 == 0);

        int a = 0;

        System.out.println( false && a++ ==5); // if the
        System.out.println(a);


        int b = 0;

        System.out.println( false & b++ ==5);
        System.out.println(b);






    }

}
