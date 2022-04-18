package day38_arraylist;

import java.util.ArrayList;

public class RemoveExample {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();

        list.add("water");
        list.add("sun");
        list.add("wind");
        list.add("wood");

        System.out.println(list);

        list.remove(0);// returns: water, but we didn't use it

        System.out.println(list);

        System.out.println(list.remove(list.size()-1));
        //list.size()-1 --> last index
          // remove (last index) --> remove element : wood
        // print the removed element:


        System.out.println(list);


        list.remove("sun");
        System.out.println(list);

        System.out.println(list.remove("apple"));// return false b/c i dont have an element of apple
        System.out.println(list);

        list.add("light");
        list.add("light");
        System.out.println(list);
        list.remove("light");
        System.out.println(list);

    }
}
