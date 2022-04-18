package day32_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Book {
    public static void main(String[] args) {

        /*
        flow:
            how many chapters is there
            make a book with that many chapters
            write each chapter one at a time
                break up each chapter by sentences
         */

        Scanner in= new Scanner(System.in);
        System.out.println("How many chapter is there");
        String[][] book= new String[in.nextInt()][];
        System.out.println(Arrays.deepToString(book));
       in.nextLine();

        for (int i = 0; i < book.length; i++) {
            System.out.println("Enter chapter "+(i+1));
            String chapter=in.nextLine();
            String[]sentences= chapter.split(". ");
            book[i]=sentences;


        }

        System.out.println(Arrays.deepToString(book));













    }
}
