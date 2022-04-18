package day04_variables;

public class School {

    public static void main(String[] args) {
        int numberOfStudentsInGrade1= 85;
        int numberOfStudentsInGrade2= 90;
        int numberOfStudentsInGrade3= 56;
        int numberOfStudentsInGrade4= 78;
        int numberOfStudentsInGrade5= 40;

        System.out.println(" The number of students enrolled at Burke as a 1st grader is " + numberOfStudentsInGrade1);
        System.out.println(" The number of students enrolled at Burke as a 2nd grader is " + numberOfStudentsInGrade2);
        System.out.println(" The number of students enrolled at Burke as a 3rd grader is " + numberOfStudentsInGrade3);
        System.out.println(" The number of students enrolled at Burke as a 4th grader is " + numberOfStudentsInGrade4);
        System.out.println(" The number of students enrolled at Burke as a 5th grader is " + numberOfStudentsInGrade5);

        int TotalNumberOfStudents= numberOfStudentsInGrade1+numberOfStudentsInGrade2+numberOfStudentsInGrade3+numberOfStudentsInGrade4+numberOfStudentsInGrade5;

      System.out.println("The total number of students in Burke School is "+TotalNumberOfStudents);
        double days=183.5;
        System.out.println("There are " +days+ " days a year");
        double snowDays= 14;

        System.out.println("There are " +snowDays+ " snow days each year for students to use without making them up");
        double GPA=3.8;
        System.out.println("Burke is one of the higher rated schools with " +GPA+ "GPA");

    }
}
