package day09_scanner;

public class OperatorPractice {
    public static void main(String[] args) {


    /*
 Evaluate the expressions step by step. NOT in intellij, do it yourself

int w = 78 / 2 * 2 + 3 - 5 % 5;

what is z?
*/
    int w = 78 / 2 * 2 + 3 - 5 % 5;
        System.out.println("what is w? "+w); // 81
        System.out.println("----------------------------------------");


    /*
    int a = 8;
int b = a--;

what is a?
what is b?

     */
    int a = 8;// 8->7
    int b = a--;// b=8

        System.out.println(a);
        System.out.println(b);
        System.out.println("----------------------------------------");

/*
int A = 50;
int B = --A + A++ + A-- + A++;

what is A?
what is B?

 */

        int L = 50;// L=50 -> 49 -> 50 -> 49 ->50
        int P = --L + L++ + L-- + L++;//
        //       49 + 49 + 50 + 49
        System.out.println(L); // 50
        System.out.println(P); //
        System.out.println("----------------------------------------");

/*
int R = 20;
int W = -R-- + -R++ + --R * R-- % 2;

what is R?
what is W?

 */
        int R = 20;// R= 20 -> 19-> 20->19-> 18
        int W = -R-- + -R++ + --R * R-- % 2; // negative sign will not affect the value of R
/*              - 20 - 19+ 19 * 19 %2
                -20  - 19 + 361 % 2
                  -20-19+1
                  -38
 */
        System.out.println(R);// 18
        System.out.println(W);// -38
        System.out.println("----------------------------------------");




        int e = 1;//e=1 > 0 > 1 > 0 >-1
        int f = -e-- + e++ / -e-- * --e;
         //      -1+ 0/ - 1 * -1
        //          -1+0*-1
        //          -1

        System.out.println(e);
        System.out.println(f);
        System.out.println("----------------------------------------");

        /*int M = 300;
int N = 400;
int U = ++M + N++ - M-- % 2 + --N % 2;

what is M?
what is N?
what is U?
         */

        int M = 300;// m=300 > 301 >300
        int N = 400;// n= 400 > 401 > 400
        int U = ++M + N++ - M-- % 2 + --N % 2;
        //       301+ 400-301 % 2 + 400 % 2
        //          301 + 400 - 1 + 0
        //              701-1
       //                  700
        System.out.println(M);
        System.out.println(N);
        System.out.println(U);

}}

