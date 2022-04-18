package day37_wrapper_arraylist;

public class ValueVSParse {
    public static void main(String[] args) {

        String s="30";
        int seconds= Integer.parseInt(s); //  converts the "30" String into an int of 30

        Integer i= Integer.valueOf(s); // converts the "30" String into the Integer wrapper class object

        int i2= Integer.valueOf(s);// it works but don't do it
        /*
        Integer.valueOf(s); --> converts the "30" String into the Integer object
        int i2= --> im trying to restore the value into a primitive variable

        primitive= object type [unboxing]
         */
        Integer i3= Integer.parseInt(s);
        /*
        Integer.parseInt(s); --> converts the "30" String into  a primitive datatype int
        Integer i3= --> im trying to restore the value into an Integer object

        primitive= object type [unboxing]
         */

        String s2= String.valueOf(30);
        System.out.println(s2+5);
    }
}
