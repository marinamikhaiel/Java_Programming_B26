package day18_string;

import java.util.Locale;
import java.util.Scanner;

public class filter {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);




        System.out.println("Enter your message");
        String message= input.nextLine(); // input.nextLine().toLowerCase(Locale.ROOT).trim();
        message=message.toLowerCase(Locale.ROOT);
        message=message.trim();

        if (message.contains("java is bad")|| message.contains("quit") || message.contains("have fun") || message.contains("crying")){
            System.out.println("message failed to send");

        }else {
            System.out.println(message+ " was sent");
        }


    }
}
