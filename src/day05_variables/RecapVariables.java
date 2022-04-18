package day05_variables;

public class RecapVariables {
    public static void main(String[] args) {
        // declare variables
        byte numberOfCoffeeCups;
        double totalPriceOfCoffee;
        int totalStudentInClass;

        // We can't print the variables because they don't have a value ( line 11-13)
//        System.out.println(numberOfCoffeeCups);
//        System.out.println(totalPriceOfCoffee);
//        System.out.println(totalStudentInClass);


        // assigning a variable

        numberOfCoffeeCups =2;
        totalPriceOfCoffee = 10.25;
        totalStudentInClass = 432;

        System.out.println(numberOfCoffeeCups);
        System.out.println(totalPriceOfCoffee);
        System.out.println(totalStudentInClass);

        System.out.println(numberOfCoffeeCups+totalStudentInClass);
        System.out.println(numberOfCoffeeCups+ "\\" +totalStudentInClass); // we use concatenation to print the values of teo variable at the time

        // declare and assign

        double temperature = 20.6;
        int javaDays = 5;

        System.out.println("\n\nThis is my temperature: " + temperature);
        System.out.println("It is day "+javaDays+ " in java class");

    }
}
