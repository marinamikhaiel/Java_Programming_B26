package day32_arrays;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {

        String [][] cydeo=new String[4][];
//        String [][] cydeo=new String[4][3];
       // [[null, null, null], [null, null, null], [null, null, null], [null, null, null]]
        // 4 inner arrays that each has a size of 3
        System.out.println(Arrays.deepToString(cydeo));

        String [] groupOne={"Emre", "Yasir", "Eda"};
        cydeo[0]= groupOne;
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("Adding group 2");
        String [] groupTwo= {"Basri", "Demet", "Shina", "Ismayil"};
        cydeo[1]= groupTwo;
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("Adding group 3");
       // String [] groupThree= {};
        cydeo[2]= new String[]{"Mustafa", "Lima"};// different way. syntax to create an arraywithout a reference
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("Same group 3 as group 4");

        cydeo[3]=cydeo[2];
        System.out.println(Arrays.deepToString(cydeo));

        for (String[] innerArray:cydeo) {// loops through the 2D array, cydeo

            for (String eachWord:innerArray){// loops through every String element in each 1D inner array
                System.out.println(eachWord);

            }

        }











    }
}
