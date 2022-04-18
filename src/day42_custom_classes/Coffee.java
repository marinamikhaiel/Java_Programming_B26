package day42_custom_classes;

public class Coffee {

    String brand;
    double price;
    double size;
    String types;

    @Override
    public String toString() {
        return types+" from " + brand +" size of " + size +" oz. For a total price of $"+ price ;


    }

    public void drink(){
        System.out.println("Drinking "+types);
        size-=1.5;
    }
    public void refill(double amount){
        System.out.println("Refilling "+amount+" oz of "+types);
        size+=amount;

    }
    /*
    public void refill(double size){
        System.out.println("Refilling "+size+" oz of "+types);
        size+=amount;

    }
    this updates the local size from the parameter, not the instance size
     */


}
