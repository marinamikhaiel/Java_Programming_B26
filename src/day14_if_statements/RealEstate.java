package day14_if_statements;

import java.util.Scanner;

public class RealEstate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your max budget");
        int budget = input.nextInt();
        String name="", range="";// java will not complain since its declaired and assigned
        double rate=0;
        boolean gated=false, allowPet=false, isAvailable= true;

        if (budget > 0 && budget < 300_000) {
            System.out.println("Looking for houses");
            if (budget >= 55_000 && budget <= 75_000) {
                name= "Oaks";
                range="55,000-90,0000";
                rate=3.5;
                gated= true;
                allowPet= true;
            } else if (budget >= 80_000 && budget <= 100_000) {
                name= "Hills";
                range="80,000-100,0000";
                rate=4.0;
                gated= false;
                allowPet= true;
            } else if (budget >= 120_000 && budget <= 150_000) {
                name= "OHighland";
                range="120,000-150,0000";
                rate=4.5;
                gated= true;
                allowPet= false;
            } else if (budget >= 160_000 && budget <= 201_000) {
                name= "Canyon";
                range="160,000-201,000";
                rate=4.8;
                gated= true;
                allowPet= true;
            } else {
                System.out.println("No available houses");
                isAvailable= false;
            }
            if (isAvailable){
                String ad= "Name of the neighberhood: "+ name+"\nPrice range:"+range+"\nRating:"+rate;
                ad+= "\nGated: "+ (gated ? "Yes ":"No "); // this means if the gated boolean is true, it will concatenate " yes" into the ad, but if the gate boolean is false it will concatenate "no" into the add
                ad+= "\n"+(allowPet? "They allow pets":"They don't allow pets");
                System.out.println(ad);
            }


        }else{
                if (budget <= 0) {
                    System.out.println("Your budget cannot be less than or equal to 0");
                } else {
                    System.out.println("Too much money for this agency");
                }
            }






    }
}
