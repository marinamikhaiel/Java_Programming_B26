package day28_array;

import java.util.Arrays;
import java.util.Scanner;

public class FriendsList {
    /*
    make an array of your friends names
    asking how many friends do you have
    then ask for each friend's name one at a time into an array
     */
    public static void main(String[] args) {


    Scanner in=new Scanner(System.in);
        System.out.println("How many friends do you have");
        int numOfFriends= in.nextInt();
        String[] names = new String[numOfFriends];

        for (int i = 0; i < numOfFriends; i++) {
            System.out.println("Enter your friend's names ");


            names[i] = in.next();

        }
        System.out.println(Arrays.toString(names));



}
}