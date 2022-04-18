package day09_scanner;

public class EligibleToVote {

    public static void main(String[] args) {
        /*
        name
        are they citizen
        do have a criminal background
        age

         */

        String name = " Perpetua Habib";
         boolean isCitizen = true;
         boolean hasACriminalBackground = false;
         int age = 20;
         boolean isEligibleToVote = age>=18 && isCitizen && !hasACriminalBackground; // use ! to flip the answer so it can say doesn't have criminal background


        System.out.println( name+ " is eligible to vote: " +isEligibleToVote);

        System.out.println(isCitizen);

    }
}
