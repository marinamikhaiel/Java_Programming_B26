package day23_Loops;

import java.util.Scanner;

public class GuessANumber {

    public static void main(String[] args) {
        /*
        create a program to guess the secret number.
flow will be as follows:
define the secret number, hard coded
ask the user to guess a number
based on the guess tell them a message:

  if they guess higher than the number:
      too high

  if they guess lower than the number:
      too low

  if they guess the number:
      you guessed correctly
         */
Scanner in= new Scanner(System.in);


        int secretNum=55;
        int guessedNum;




        do {
            System.out.println("Guess a number from 1-100");
            guessedNum= in.nextInt();

            if (guessedNum>secretNum){
                System.out.println(guessedNum+ " is too high");
            }else if (guessedNum<secretNum) {
                System.out.println(guessedNum + " is too low");
            }
        }while(guessedNum!=secretNum); // when it is false you will stop the while loop
            System.out.println("you guessed correctly");

    }
}
