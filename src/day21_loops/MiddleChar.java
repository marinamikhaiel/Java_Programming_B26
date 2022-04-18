package day21_loops;

public class MiddleChar {
    /*
    [Middle char]
Given a String, write a program to display the middle character of a string
a) If the length of the string is even there will be two middle characters. b) If the length of the
string is odd there will be one middle character.
Ex:
Input: elephant
Output: The middle characters: ph
     */
    public static void main(String[] args) {

        String s= "abcdef";

        int mid=s.length()/2;

        if(s.length()%2==0){
            // word is even
            // length/2 => 6/2=3
            char firstMiddle= s.charAt(mid-1);
            char secondMiddle= s.charAt(mid);
            System.out.println("With charAt: "+firstMiddle+secondMiddle);
            System.out.println("With subString: "+ s.substring(mid-1,mid+1));



        }else {
          //  word is odd

            char middle= s.charAt(mid);// length/2:5/2==2
            System.out.println("With charAt: "+middle);
            System.out.println("With subString: "+s.substring(mid, mid+1));
        }
    }
}
