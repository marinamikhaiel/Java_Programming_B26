package day24_loops;

public class CountJava {
    public static void main(String[] args) {
        /*
        java is a java language

        java 0,4 i,i+4
        ava  1,5
        va i 2,5
         */

        String str= "java is a java language. java";
        int count=0;

        for (int i = 0; i < str.length()-3; i++) {
            String eveyFour= str.substring(i,i+4);
            if(eveyFour.equals("java")){
                count++;
            }
        }
        System.out.println("how many times \"java\" has been repeated? ");
        System.out.println(count);
        /*
        we did subString (i,i+4) to read every four characters in the String
        doing i+4 causes the program to out of bounds

        so to fix it we tried  i < str.length()-4
        but -4 skipped the last 4 characters in the String

        so either you had to do
         i <= str.length()-4
         or
          i < str.length()-3
          because the second number in substring is not included in the result

         */
    }
}
