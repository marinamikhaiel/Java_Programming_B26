package day22_loops;

import java.util.Scanner;

public class ColorPicker {
    public static void main(String[] args) {
        // flow: ask for a color
        //  get 3 unique colors by the end
        Scanner in=new Scanner(System.in);
        int colorsPicked=0;
        String uniqueColors= "";


        while (colorsPicked<3){
            System.out.println("Pick a color");
            String color= in.nextLine();


            if (uniqueColors.contains(color)){
                System.out.println("you already have that color");
            }else {
                // if we are here that means that the color is unique
                uniqueColors+= color+" ";
                colorsPicked++;
            }
        }

        System.out.println(uniqueColors);
    }

}
