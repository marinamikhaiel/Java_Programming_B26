package day07_unary_operators;

public class Store {

    public static void main(String[] args) {

        String store = "Target";
        int numberOfTvs = 100;

        System.out.println(" person comes into the store and they bought a tv");
        System.out.println(" Number of Tvs now: " + --numberOfTvs); // 100-1 pre-decremented the # of tvs

        System.out.println(" person comes into the store and they bought a tv");
        System.out.println(" Number of Tvs now: " + --numberOfTvs);

        System.out.println(" person comes into the store and they put tv into there cart");
        System.out.println(" Number of Tvs in the store: " + numberOfTvs--); // post decrement
        System.out.println(" person bought it, now I have: " +numberOfTvs);

        System.out.println("I get a shipment");
        numberOfTvs = numberOfTvs+13;

        System.out.println("Tvs in stock: " +numberOfTvs);
    }







        }



