package day23_Loops;

public class CountLetter {
    public static void main(String[] args) {
        String word= "aabbcaa";
        int count=0;


        for (int i= 0; i<word.length(); i++){
            if (word.charAt(i)=='a') {// checks if every character is equal to a
                count++;
            }
        }
        System.out.println(count);

    }
}
