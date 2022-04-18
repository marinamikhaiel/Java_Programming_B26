package day05_variables;

public class CellPhone {
    public static void main(String[] args) {
        String brand = "apple";
        String model = "iphone 10";
        String color = "black";
        double price = 1000.99;
        int storage = 128;

        boolean hasCamera = true;
        char sim = 'A';

        System.out.println("I have an " +model+ " from " +brand);
        System.out.println("It came in the color " +color+ " and it has a " + storage+ " GB");
        System.out.println("For the sim type " +sim+ " with a camera " +hasCamera+ " the total price was $ " +price);
        System.out.println();
        System.out.println();
        // approach 2 with String variable:

        String fullMessage = "I have an " +model+ " from " +brand+ "\nIt came in the color " +color+ " and it has a " + storage+ " GB \nFor the sim type " +sim+ " with a camera " +hasCamera+ " the total price was $ " + price;
        System.out.println(fullMessage);
    }
}
