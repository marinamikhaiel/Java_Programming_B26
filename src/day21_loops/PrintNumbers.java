package day21_loops;

public class PrintNumbers {
    public static void main(String[] args) {

        int even=2;



        while (even<=100){
            System.out.println(even);
            even+=2;

        }

        // approach 2

        int n= 1;
        while (n<=100){
            if(n%2==0){
                System.out.println(n);
            }
            n++;}
            int f= 0;
            while (f++<100){
                if (f%2==1){
                    System.out.print(f+" ");
                }
                ;
            }
        System.out.println();
            int h=1;
            while (h<=100){
                System.out.print(h+ " ");
                h+=2;
            }
        }

    }

