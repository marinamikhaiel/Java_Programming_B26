package day23_Loops;

public class CountHi {
    public static void main(String[] args) {

        String str="aaaahiahhihibbbcch";
        int count=0;
//                         index <= str.length()-2
        for (int index= 0; index < str.length()-1; index++) {
            if (str.charAt(index)=='h' && str.charAt(index+1)=='i'){
                count++;

            }

        }

        System.out.println(count);


    }
}
