package day28_array;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {

        String [] items= {"Shoes", "Jackets","Gloves", "Airpods","Ipad",};
        System.out.println(Arrays.toString(items));
        // do we have jackets in stock
boolean hasJackets= false;
        for (int i = 0; i < items.length; i++) {
            ;
            if (items[i].equalsIgnoreCase("jackets")){
                hasJackets=true;
                break;
            }

        }
        System.out.println(hasJackets? "Jackets in stock": "Jackets out of stock");
        System.out.println(Arrays.toString(items).toLowerCase(Locale.ROOT).contains("jackets"));
        System.out.println();


        Scanner input=new Scanner(System.in);
        System.out.println("What item are you looking for");
        String item=input.nextLine();

        boolean inStock=false;

        for (int i = 0; i < items.length; i++) {
            if(items[i].equalsIgnoreCase(item)){
                inStock=true;
                break;
            }

        }
        System.out.println(item+ (inStock ? " in Stock":" out of stock"));



    }
}
