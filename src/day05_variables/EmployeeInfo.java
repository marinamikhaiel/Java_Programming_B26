package day05_variables;

public class EmployeeInfo {
    public static void main(String[] args) {
        String first, last, company, jobTitle;
        char gender, suite;
        int age, pto;
        double salary;
        boolean fullTime, married;

        first= "Marina";
        last= "Mikhaiel";
        company= "Fairfax County Public School";
        jobTitle= "SPED Teacher";
        gender= 'F';
        suite='B';
        age=33;
        pto= 20;
        salary=60_000;
        fullTime= true;
        married= false;

//        String first = "Marina";
//        String last = "Mikhaiel";
//        char gender= 'F';
//        String company= " Fairfax County Public School";
//        boolean fullTime= true;
//        String jobTitle = "SPED Teacher";
//        double salary= 60000;
//        int pto = 20;
//        boolean married= true;
//        char suite= 'B';

        String fullDetails = "Employment information for " +first+ " " +last+ " gender "+gender+".\n" + jobTitle+ "at "+company+ " currently " +age+ " years old.\n" +company+ "is located in suite "+suite+" . This year salary comes to $"+salary+".\n Other details: PTO: " +pto+", full time? " +fullTime+ ", married? "+married;

        System.out.println(fullDetails);



//        System.out.println( first + last+ " is a " + gender+ " who works for " + company+ " as a " + jobTitle);
//        System.out.println( "Her Salery");

    }
}
