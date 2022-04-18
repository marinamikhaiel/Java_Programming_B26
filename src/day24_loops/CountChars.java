package day24_loops;

public class CountChars {
    /*
    Count upper, lower, and numbers
Given a String, find and print how many uppercase letter, lowercase
letter, and number are in the String.
Ex:
Input: 2juMp41EEkd4s4
Output:
3 uppercase letters
6 lowercase letters
5 numbers

     */
    public static void main(String[] args) {
        String cha= "2juMp41EEkd4s4";
        int upperCase=0;
        int lowerCase=0;
        int num= 0;



        for (int i = 0; i < cha.length(); i++) {
           char letter= cha.charAt(i); // get the character at the index number i for this iteration, and stores into the variable letter for reuseability


           if (letter>= 'A' && letter<= 'Z') {
               upperCase++;
           }else if (letter>= 'a' && letter<= 'z') {
                lowerCase++;
            }else if (letter>= '0' && letter<= '9') {// 9 because as a single character can only go up to 9
                num++;
            }

        }
        System.out.println("Word: "+cha);
        System.out.print("Upper cases: "+upperCase+" ");
        System.out.print("\nLower case: " +lowerCase+" ");
        System.out.print("\nNumbers: "+num+ " ");

    }
}
