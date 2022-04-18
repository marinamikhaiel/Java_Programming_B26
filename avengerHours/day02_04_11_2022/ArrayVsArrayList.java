package day02_04_11_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    /*
    ArrayList-> is a data structure, a member of collection framework
                A class of java that is similar to array but allows us to store only objects
                Size is dynamic (changeable)
                - what does it mean?

                has its own methods (unlike array) add(), get(), remove()
                how? does arrays have methods? sort(), binarySearch() ??
     */
    public static void main(String[] args) {
        // declaring an array

        int[] arr1;// accepts obj and primitive

        // declaring an arraylist
        ArrayList<Integer> list1; //must be object type

        // instantiating array
        arr1=new int[4]; //[0,0,0,0] -> length= 4
        arr1[0]=100; //[100,0,0,0]-> length= 4


        // instantiating arraylist
        list1=new ArrayList<>(); // [] -> size=0
        list1.add(100); //[100]-> size=1
        list1.remove(0); // [] -> size=0

        int number=50;
        list1.add(number); // autoboxing
        System.out.println(list1);
        list1.get(0); // wrapper class Integer
        // number still primitive


       // initialization an array
        Integer [] arr2={1,2,3}; // [1,2,3]
        // initialization an arraylist with specific values
        ArrayList<Integer> list3= new ArrayList<>(Arrays.asList(1,2,3,4));

        ArrayList<Integer> list4=new ArrayList<>(Arrays.asList(arr2));// arr2 needs to be Integer in order for it to work and not int(line 42)

        System.out.println("=============================");

        // own methods of ArrayList

        int[] arr4={100,200,300};
        ArrayList<Integer> list5= new ArrayList<>(Arrays.asList(1,2,3,4));

        int length= arr4.length;
        list5.add(20);






    }
}
