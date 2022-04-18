package day06_arithmetic_operators;

/*
Create a class House
    create a main method

    - Each the datatype you feel is most appropriate for each variable.

    - Create the following variables:
        house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?, is there an attic, is there a pool, is the house for sale?, cost of the house, address, zipcode, is a park near by, Rating of surrounding school districts (out of 5),

    - Print each variable with a message with the value
        Ex: The number of bedrooms is: 4
            The number of bathrooms is: 3
 */
public class House {
    public static void main(String[] args) {

//        approach 1
        String houseType= "Penthouse";
        int numberOfBedrooms = 4;
        int numberOfBathrooms = 3;
        int numberOfKitchens = 2;

        boolean hasBasement = false;
        boolean hasAttic = false;
        boolean hasPool= true;
        boolean isOnSale= false;

        double costOfHouse =1_000_000.99;
        String address = "12345 Central Park";
        int zipcode = 20121;
        boolean hasPark = true;
        double schoolRating = 4.6;

        String houseInfo = " The " +houseType+ "on "+address+ ", "+zipcode+ " costs $ " +costOfHouse+ "\nThe "+houseType+ " has "+numberOfBedrooms+" bedrooms, "+ numberOfBathrooms+ " bathrooms, " +numberOfKitchens+ "kitchen\n It also includes a basement: "+hasBasement+ " has an attic: "+hasAttic+ " has a pool: " +hasPool+ " is for sale: " +isOnSale+ " and has a park: "+hasPark+ ".\n The schools in the area have a rating of "+schoolRating;

        System.out.println(houseInfo);

//        approach 2
//        int numberOfBedrooms=4; numberOfBathrooms= 3, numberOfKitchens = 2,zipcode = 20121;
//        boolean hasBasement = false, hasAttic = false, hasPool= true, isOnSale= false;
//        String houseType= "Penthouse", address = "12345 Central Park";
//        double costOfHouse =1_000_000.99, schoolRating = 4.6;

    }

}
