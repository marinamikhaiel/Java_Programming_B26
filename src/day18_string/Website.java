package day18_string;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the website");
        String website= input.next();
/*
boolean validStart = website.startsWith("www.");
boolean validEnd=  website.endsWith(".com" )||website.endsWith(".edu")||website.endsWith(".gov")||website.endsWith(".net");

        if(validStart && validEnd){
            System.out.println(url + " is a valid website");
        } else {

            if(!validStart){
                System.out.println("url needs to start with www.");
            }

            if(!validEnd){
                System.out.println("url needs to end with .com or .edu or .net. or .gov");
            }

        }
        */

        if (website.startsWith("www.") && website.endsWith(".com" )||website.endsWith(".edu")||website.endsWith(".gov")||website.endsWith(".net") ){
            System.out.println(website+"Its loading");
        }else {
            if (!(website.startsWith("www.") )){

            System.out.println("invalid URl. it need to start with WWW. ");
        }if (!(website.endsWith(".com" )||website.endsWith(".edu")||website.endsWith(".gov")||website.endsWith(".net")) ) {

                System.out.println("invalid URl. it need to end with one of the following.edu, .gov, .com, .net   ");
            }}




    }

}
