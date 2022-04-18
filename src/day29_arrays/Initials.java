package day29_arrays;

public class Initials {
    public static void main(String[] args) {

/*
    Initials
• Given an array of classmate’s names, first name and last separated by a space, print the initials of everyone
    Ex: Input:
    [ “James Bond”, “Eve Rell”, “Anna Johnson” ] Output:
    JB ER AJ
     */

        String [] names={"James Bond", "Eve Rell", "Anna Johnson"};


        for (int i = 0; i < names.length; i++) {
            String firstName=names[i].trim();
            String lastName=firstName.substring(firstName.indexOf(" ")+1);
            System.out.println(""+firstName.charAt(0)+lastName.charAt(0));

        }
        for (String str:names) {
            String firstName=str.trim();
            String lastName=firstName.substring(firstName.indexOf(" ")+1);
            System.out.println(""+firstName.charAt(0)+lastName.charAt(0));

        }
    }
}
