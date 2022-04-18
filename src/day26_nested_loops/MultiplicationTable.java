package day26_nested_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        /*
        print the multiplication by the numbers 1-10 we will see for all numbers 1-10

         */

        for (int j = 1; j <=10; j++) {
            System.out.println("\nmultiple by : "+j);
            for (int i = 1; i <=10; i++) {
                System.out.print(j +" x "+i +" = "+i*j+" | ");

            }


        }






    }
}
