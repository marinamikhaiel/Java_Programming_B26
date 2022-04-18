package day27_nested_loops;

import java.util.Scanner;

public class IQ_FinraInRange {
    /*
    similar to fizzbuzz

    number
    %3---> fin
    %5---> ra
    both--> finra
    neither--> number

    repeated up to some number

     */
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("enter your stopping point");
        int stop= in.nextInt();

        for (int i = 1; i <= stop; i++) {
            String str= "";
             if (i%3==0) {
                 str += "FIN";
             }
              if (i% 5==0){
                  str+="RA";
              }
            System.out.println(str.isEmpty()?i:str);
             }
        }
    }





