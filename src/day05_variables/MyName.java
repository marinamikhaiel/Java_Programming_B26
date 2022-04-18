package day05_variables;

public class MyName {
    public static void main(String[] args) {
        char firstLetter='M';
        char secondLetter='a';
        char thirdLetter='r';
        char forthLetter='i';
        char fifthLetter='n';


        System.out.println(firstLetter);
        System.out.println(secondLetter);
        System.out.println(thirdLetter);
        System.out.println(forthLetter);
        System.out.println(fifthLetter);
        System.out.println(secondLetter);


        System.out.println();

        System.out.println(firstLetter+" "+ secondLetter+" "+ thirdLetter+" "+forthLetter+" "+fifthLetter+" "+secondLetter);

        // or you can make a variable of the name

        String name= ""+firstLetter+secondLetter+thirdLetter+forthLetter+fifthLetter+secondLetter;// String name = "Marina"

        System.out.println("My name: " +name);


        System.out.println("My name: "+firstLetter+secondLetter+thirdLetter+forthLetter+fifthLetter+secondLetter);



    }
}
