package day04_variables;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        byte age = 60;// declared and assigned age variable in byte type
        System.out.println(age);
        System.out.println("age");

//        byte age2=200; 200 is to big for byte type

        short year; // declared a variable called year. it's short type
        year=2022; // assigned 2022 into my year variable
        year=2023;// reassigns the value to be 2023, it changes it

        int addressNumber = 2444400;

//        long bigNumber= 194818405999542; the value is int type, it's too big for int
        long bigNumber= 194818405999542L;


        bigNumber=9481840955959L;// adding L to the end of the number, tells the compiler it's a long number
    }

}
