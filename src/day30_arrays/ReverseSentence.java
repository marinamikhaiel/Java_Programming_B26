package day30_arrays;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {

        /*
        given a sentence
        today is monday

        reverse the sentence
        monday is today
         */

        String sent="today is monday";
        String[]words=sent.split(" ");
        String reverse="";

        for (int i = words.length-1; i >=0; i--) {
            reverse+=words[i]+" ";

        }
            System.out.println(reverse.trim());
        }







    }

