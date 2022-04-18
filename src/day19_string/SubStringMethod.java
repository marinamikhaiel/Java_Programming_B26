package day19_string;

public class SubStringMethod {
    public static void main(String[] args) {

        String str="Sunday";
        //          012345

        System.out.println(str.substring(1));// starts on number 1 and show the rest unday
        System.out.println(str.substring(3));// day
        System.out.println(str);// sunday
        System.out.println("Satur"+str.substring(3));// saturday

        System.out.println(str.substring(2,4));// start at 2 and end before 4 nd
        System.out.println(str.substring(0,5));// sunda
        System.out.println(str.substring(0,6));// 6 is not in the range ,but it will not cause a problem since it will not print and that's where it stops
//        System.out.println(str.substring(0,6)); out of bounds because 6 index doesn't exist


    }
}
