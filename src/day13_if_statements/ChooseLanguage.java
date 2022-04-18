package day13_if_statements;

import java.util.Scanner;

public class ChooseLanguage {

        /*
        ask the user to enter a number based on the language they wanted to use.
        1 - English
        2 - Spanish
        3 - Turkish
        4 - Russian
        5 - French

    based on the number they picked print a message:

        1 : "hello, thank for your call"
        2 : "hola, gracias para llamar"
        3 : "merhaba, aradiginiz icin tesekkurler"
        4 : "privet, spasibo za vash zvonok"
        5 : "Merci ,pour votre appel"
        any other number: "We will use English by default"
         */
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println(" Enter a number based on the language you need ");
            System.out.println("\t1 - English\n" +
                    "\t2 - Spanish\n" +
                    "\t3 - Turkish\n" +
                    "\t4 - Russian\n" +
                    "\t5 - French");
            int language =input.nextInt();
            String message;

            if (language==1) {
                message= "hello, thank for your call";
            }else if (language==2) {
                message="hola, gracias para llamar";
            }else if (language==3){
                message="merhaba, aradiginiz icin tesekkurler";
            }else if (language==4){
                message="privet, spasibo za vash zvonok";
            }else if (language==5) {
                message="Merci ,pour votre appel";
            } else {
                message= "hello, thank for your call";
            }
            System.out.println(message);


        }
    }


