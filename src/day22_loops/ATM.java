package day22_loops;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("Welcome to ATM");
        int validPin=1234;
        int userPin;
        int attempts= 0;
        do{
            System.out.println("Enter your pin");
            userPin= in.nextInt();
            attempts++;


        } while (attempts < 3 && validPin != userPin);{
            if( validPin== userPin){
                System.out.println("Logged in");
            }else{
                System.out.println("locked out");
        }}
    }
}
