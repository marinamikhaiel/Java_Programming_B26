package day42_custom_classes;

import java.util.Scanner;

public class UsingApp {
    public static void main(String[] args) {

        App cydeo = new App();
        cydeo.name = "Cydeo";
        cydeo.version = 5.5;
        cydeo.isFree = true;

        // we cann't call instance methods
//        App.run();
//        App.update();

        System.out.println(cydeo.version);
        cydeo.run();
        cydeo.update();

        System.out.println(cydeo.name);
        System.out.println(cydeo.version);
        System.out.println(cydeo.isFree);
        System.out.println(cydeo);

        new App().run();// this creates/ `running a new object without a reference and calls the run method
        System.out.println(new Scanner(System.in).nextLine());
        // System.out.println(new Scanner(System.in).nextLine()); no scanner object
    }
}
