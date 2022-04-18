package day26_nested_loops;

public class FrequencyOfCharacter {
    /*
    String apple

    count how many times each letter is in the String
    a-1
    p-2
    l-1
    e-1
    what wwe will try to do:
    we will go one character at a time
    charAt(0)-->a
    apple
    a==a
    a==p
    a==p
    a==l
    a==e
     charAt(1)-->p
     p==a
     p==p
     p==p
     p==l
     p==e
     */
    public static void main(String[] args) {


    String word="apple";
String checked="";
        for (int i = 0; i < word.length(); i++) {
            int count=0; // everytime the outer loop iterates, the counter is set back to 0. it is reset between every character
            char letter= word.charAt(i);
            if (checked.contains(""+ letter)){
                continue;
            }
            for (int j = 0; j < word.length(); j++) {
                char eachLetter= word.charAt(j);

                if(letter==eachLetter){
                    count++;

                }


            }
            System.out.println(letter+" - "+count);
            checked+= letter;

        }





}
}




