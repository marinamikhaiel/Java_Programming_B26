package day07_unary_operators;

public class Pizza {

    public static void main(String[] args) {
        String  pizzaType= "cheese pizza";
        int numberOfSlices = 10;
        int numberOfPeople = 4;
        int slicesPerPerson = numberOfSlices/numberOfPeople;
        int leftOver = numberOfSlices % numberOfPeople;

        String theOrder = " We ordered " + pizzaType+ " with "+numberOfSlices+ " slices, "+numberOfPeople+ " people ate " + slicesPerPerson+ " slices each with " + leftOver+ " left over";

        System.out.println(theOrder);
    }
}
