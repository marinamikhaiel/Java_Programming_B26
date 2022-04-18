package day27_nested_loops;

public class BreakInNested {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("i: " +i);
           // if (i==3){
              //  break; if the break is here the outer loop will stop, which means both will no longer run. we get 3 full iterations of the outer loop, including the inner loop running start to finish then when i is equal to 3 the outer loop will stop.
            //}
            for (int j = 0; j < 2; j++) {
                System.out.println("\tj: "+j);
                //break;if the break is here the outer loop will iteration fully but the inner loop will execute the first iteration and then the break runs, which stops the inner loop. code resume after the outer iterations finishes

            }
            System.out.println();
            break;// if the break is here the first iteration of the inner loop will run, then the outer loop stops
        }
    }
}
