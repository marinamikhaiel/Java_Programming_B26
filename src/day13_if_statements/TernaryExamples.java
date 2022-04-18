package day13_if_statements;

public class TernaryExamples {
    public static void main(String[] args) {

        int a= 4;
        String evenOrOdd;
        if (a%2==0){
           evenOrOdd="Even";
        }else{
            evenOrOdd="Odd";
        }

        String result = a%2==0 ? "Even": "Odd";

        System.out.println(evenOrOdd);
        System.out.println(result);


        System.out.println("--------------------------------------");

        int num = 4;
        String posOrNeg;

        if (num>0) {
            posOrNeg = "Positive";
        } else if (num <0){
            posOrNeg = "negative";
        }else {
            posOrNeg = "Zero";
        }
        System.out.println(posOrNeg);

        String sign = (num>0)? "positive": (num <0) ? "negative" :"Zero";
        System.out.println(sign);

        System.out.println("--------------------------------------");

        int time = 12;
        double price;

        if (time>=10 && time<= 15){
            price=7.99;
        }else {
            price=10.99;
        }

        double ternaryPrice = (time>=10 && time<= 15) ? 7.99: 10.99;
        System.out.println(ternaryPrice);

    }

}
