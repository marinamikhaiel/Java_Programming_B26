package day09_scanner;

public class Discount {
    public static void main(String[] args) {


        boolean isWeekend = true;
        boolean isTeacher = false;
        boolean isPoliceOfficer = false;
        boolean isFireFighter = true;
        boolean getDiscount = isWeekend && (isTeacher || isFireFighter|| isPoliceOfficer); // () is needed to group them

        System.out.println(" Do you get a discount? " + getDiscount);

    }
}
