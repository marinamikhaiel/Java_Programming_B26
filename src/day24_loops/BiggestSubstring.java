package day24_loops;

public class BiggestSubstring {
    /*
    Biggest substring of matching characters
Given a String find the biggest substring of chars that match and print
it.
Ex: aaabbbcccccddddee
Output: ccccc
     */
    public static void main(String[] args) {

        String str="aaabbbcccccddddee";
        String sub="";
        String biggest="";

        for (int i = 0; i < str.length()-1; i++) {

                sub+= str.charAt(i);
                if (str.charAt(i) != str.charAt(i+1)){ // when the character of i us different from the character next to it (i+1)
                    if(sub.length()>biggest.length()){
                        biggest=sub;// assign the substring as the new biggest

                    }
                    sub="";// resets this String from the next substring
            }

        }

    }
}
