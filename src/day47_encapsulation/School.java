package day47_encapsulation;

import day46_static.CydeoStudent;

public class School {
    public static void main(String[] args) {
        CydeoStudent marina=new CydeoStudent("Marina", 12);
        System.out.println(marina);
        System.out.println();
        CydeoStudent.printInfo();
        marina.printInfo();

        System.out.println();
        System.out.println(CydeoStudent.instructors[0]);

        System.out.println();
        for (String each: CydeoStudent.instructors){
            System.out.println(each);
        }
    }
}
