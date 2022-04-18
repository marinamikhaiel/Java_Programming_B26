package day15_switch;

import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("What day do you want to know about?");
        String day= input.nextLine();

        String topic="";
        String instructor="";
        String time="";
        String officeHour="";
        switch (day){
            case "Monday": case"monday": case "mon": case"Mon":
                topic="Java";
                instructor=" Saim";
                time="7pm-10pm";
                break;
            case "Tuesday": case "tuesday": case "tue": case "Tue":
            case "Wednesday":
                topic="Java";
                instructor=" Saim";
                time="7pm-10pm";
                officeHour="Office hours from 6-7pm";
                break;
            case "Thursday":
                topic="Soft Skills";
                instructor=" Nadir";
                time="7pm-10pm";
                break;
            case "Friday":
                System.out.println("Today is day off, or as Nadir says soft skill study day");
                break;
            case "Saturday":
            case "Sunday":
                topic="Java";
                instructor="Saim";
                time="9am-5pm";
                break;
            default:
                System.out.println("Not a valid day");

        }
        System.out.println(topic);
        System.out.println(instructor);
        System.out.println(time);





    }
}
