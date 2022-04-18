package day10_scanner;

import java.util.Scanner;

public class Apartment {
    /*
    - address, name of owner, number of units, average size of each unit, monthly rent amount, number of washers and driers, allows pets or not, has a pool, length of lease, total number of residents in building, phone number of owner, is near a gas station, number of floors, has a basement, has available units for rent, has air conditioning, number of parking spaces, has wheel chair access, number of review stars (out of 5)

        - Create these variables and use previous variables to get the values

            - monthly rent after 3 years (discount 10% off original rent)
            - monthly rent after 6 years (discount 20% off original rent)
            - Average number of residents per unit (total residents / number of units)
            - Average number of parking spots per unit ( parking spots / units)
            - Average number of units per floor ( units / number of floors)

     */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
/*- address, name of owner, number of units, average size of each unit, monthly rent amount, number of washers and driers, allows pets or not, has a pool, length of lease, total number of residents in building, phone number of owner, is near a gas station, number of floors, has a basement, has available units for rent, has air conditioning, number of parking spaces, has wheel chair access, number of review stars (out of 5)

 */
        System.out.println(" Please enter the address");
        String address= input.nextLine();
        System.out.println(" Please enter the owner's name");
        String name= input.nextLine();
        System.out.println(" Please enter the number of units");
        int numOfUnits= input.nextInt();
        System.out.println(" Please enter the average size of each unit");
        double aveSize= input.nextDouble();
        System.out.println("Please enter the monthly rent amount");
        double monthlyRent= input.nextDouble();
        System.out.println("Please enter the number of washers and dryers");
        int washerAndDryer= input.nextInt();
        System.out.println(" Are pets allowed");
        boolean arePetsAllowed= input.nextBoolean();
        System.out.println(" Does it have a pool");
        boolean hasPool= input.nextBoolean();
        System.out.println(" Please enter the length of lease");
        double lengthOfLease= input.nextDouble();
        System.out.println("Please enter the total number of residents in building");
        int numOfResidents= input.nextInt();
        input.nextLine();
        System.out.println(" PLease enter " +name+ "'s phone number");
        String phoneNumber= input.nextLine();
        System.out.println(" Is it near a gas station");
        boolean isNearGasStation= input.nextBoolean();
        System.out.println("How many floors");
        int numOfFloors= input.nextInt();
        System.out.println(" Does it have a basement");
        boolean hasBasement= input.nextBoolean();
        System.out.println(" Does it have available units for rent");
        boolean hasAvailableUnits= input.nextBoolean();
        System.out.println(" Does it have air conditioning");
        boolean hasAirConditioning= input.nextBoolean();
        System.out.println("How many parking spaces");
        int numOfParking= input.nextInt();
        System.out.println(" Does it have wheel chair access");
        boolean hasWheelChairAccess = input.nextBoolean();
        System.out.println("How many review stars (out of 5)");
        double numOfStars= input.nextDouble();


/* - monthly rent after 3 years (discount 10% off original rent)
            - monthly rent after 6 years (discount 20% off original rent)
            - Average number of residents per unit (total residents / number of units)
            - Average number of parking spots per unit ( parking spots / units)
            - Average number of units per floor ( units / number of floors)

 */
        double rent3Years= monthlyRent * 0.9;
        System.out.println("The monthly rent after 3 years: $"+rent3Years);

        double rent6Years= monthlyRent * 0.8;
        System.out.println("The monthly rent after 6 years: $"+rent6Years);

        int avgResidentPerUnit= numOfResidents/numOfUnits;
        System.out.println(" The average number of residents per unit"+avgResidentPerUnit );

        int avgParking= numOfParking/numOfUnits;
        System.out.println(" The average number of parking per unit"+avgParking );

        int avgUnitPerFloor= numOfUnits/ numOfFloors;
        System.out.println(" The average number of unit per floor "+avgUnitPerFloor );




    }
}
