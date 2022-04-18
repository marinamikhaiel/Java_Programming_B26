package day30_arrays;

public class IQLongestPalindrome {
    public static void main(String[] args) {

        /*
    [IQ] Longest Palindrome
        Given a String array. Find the longest Palindrome String in your array.
        Ex:
        Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”] Output: racecar
        Ex:
        Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
        Output: No palindrome

     */
        String []words={"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};

        String longestPalindrome="";

        for (String eachWord:words) {
            boolean isPalindrome= true;
            for (int i = 0; i < eachWord.length()/2; i++) {
                if (eachWord.charAt(i)  != eachWord.charAt(eachWord.length()-1-i)){
                    isPalindrome=false;
                    break;
                }
                
            }

            if (isPalindrome && eachWord.length()>longestPalindrome.length()){
    longestPalindrome=eachWord;

            }
        }
        System.out.println(longestPalindrome.isEmpty()?"No Palindrome": longestPalindrome);
    }
}
/*
String [] arr = {"abc", "dna", "kevin", "joe", "lamp"};
        String longest = "";

        for (String word : arr) {

            String pln = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                pln += word.charAt(i);
            }
            if (word.equals(pln)) {
                if (pln.length() > longest.length()) {
                    longest = pln;
                }
            }

        }
      System.out.println((!longest.isEmpty() ? longest : "No palindrome"));
 */