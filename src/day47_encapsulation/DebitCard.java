package day47_encapsulation;

public class DebitCard {
    /*
    Debit card - custom classes + static

    Create a class for Debit Card that has the following instance variables:
        card number (long), holder name (String), card type (String), pin (int), and balance (double)

        static variables: account type (debit)
            -> Use static block to initialize account type

        */
// these are the instance variable
    long cordNumber;
    String holderName;
    String cardType;
    int pin;
    double balance;

    // static variable
   static String accountType;

   static {
       System.out.println("Static block running");// for learning pusrposess
       accountType="Checking";
   }
    /*

    Create a constructor that will create a debit card object and initialize the card number, the card holder name, and the balance. The card number has to be 16 characters long to be a valid card number. If the length is too short or too big do not store the card number and print â€œInvalid card numberâ€

    Overload the constructor to take all of the instance variables. The card type must be either MasterCard or Visa to be valid card type. If it is not one of those two then do not store the type and print â€œinvalid card typeâ€. Also the pin must be only 4 characters long. If the pin is more than or less than 4 characters then do not store the pin into the instance variable and print â€œInvalid pin lengthâ€



    */
    // this is the reference of the DebitCard object

    public DebitCard(long cardNumber, String holderName, double balance) {
        this.cordNumber = cordNumber;
        this.holderName = holderName;
        this.balance = balance;

        if(String.valueOf(cardNumber).length()==16){// ("" + cardNumber).length()
            this.cordNumber= cardNumber;
        } else {
            System.out.println("Invalid card number");
        }
    }
// this() is used to chain the constructors

    public DebitCard(long cordNumber, String holderName, String cardType, int pin, double balance) {
        this(cordNumber,holderName, balance);

        if(cardType.equalsIgnoreCase("visa")|| cardType.equalsIgnoreCase("mastercard")) {
            this.cardType = cardType;
        } else {
            System.out.println("Invalid Card type- Must be Visa or Mastercard");
        }

        if (String.valueOf(pin).length()==4){
            this.pin = pin;
        }else{
            System.out.println("Invalid Pin - Must be 4 digits");
        }


    }

    /*

    Add the toString method that will print all of the cards information (Except the pin). If the card type does not have a value do not print that line.

     */
    public String toString(){
        String info= "Holder Name: "+holderName;
        if (cordNumber != 0){
            info+= "\nCard Number: "+ cordNumber;
        }
        if (cardType != null){
            info+= "\nCard Type: "+ cardType;
        }
        info+= "\nBalance: "+ balance;
        return info;
    }


}
