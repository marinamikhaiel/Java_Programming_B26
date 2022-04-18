package day24_loops;

public class BranchingExamples {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.print(i+" ");

        }
        System.out.println();
        for (int i = 0; i <= 5; i++) {
            System.out.print(i+" ");
            break;

        }
        System.out.println();
        for (int i = 0; i <= 10; i++) {
            System.out.print(i+" ");
            if(i==5) {
                break;
            }
        }
        System.out.println();
        for (int i = 0; i <= 10; i++) {
            System.out.print(i+" ");
            if(i==5) {
                continue;// skips 5 and continue printing
            }
        }
        System.out.println();
        for (int i = 1; i <= 100; i++) {

            if(i%2==1) {
                continue; // does not print the odd numbers, it skips them and print the even.
                //everything after the 'continue' will not print
            }
            System.out.print(i+" ");
        }
    }
}
