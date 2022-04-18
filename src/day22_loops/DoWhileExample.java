package day22_loops;

public class DoWhileExample {
    public static void main(String[] args) {

       // this is a valid loop where it will print 1-10
        int a=0;

        do {
            // everything in the curly brackets are in the loop
            System.out.println(a);
            a++;

        }while (a<=10);{

        }


        System.out.println("With false boolean" );
// this loop has a boolean of false but it still

        int a2 =0;

        do {
            // everything in the curly brackets are in the loop
            System.out.println(a2);
            a2++;

        }while (a2==10);{

        }
// this is a while loop that is the same as the do while above, but nothing will print from this one because it's false . the loop never started
        System.out.println("as while loop: ");
        int a3=0;



        while (a3==10){
            System.out.println(a3);
            a3++;
        }
    }

}
