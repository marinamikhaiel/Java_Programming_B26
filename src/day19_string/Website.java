package day19_string;

import java.util.Scanner;
/*

    Task

        ask the user to enter a url
        find and print the website from the url

        assume your url always starts with www.
        assume your url always ends with .com

        www.google.com

        --> google
     */
public class Website {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the URL");
        String url= input.next();

        System.out.println(url.substring(4,url.length()-4));


    }
}
