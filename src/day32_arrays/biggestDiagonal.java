package day32_arrays;

public class biggestDiagonal {
    public static void main(String[] args) {

        char [][] letters={
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'}
        };
        char one=letters[0][0];
        char last= letters[0][letters.length-1];

        char two= letters[1][1];

        char three= letters[2][2];
        char three3= letters[2][0];




        System.out.println(""+one+two+three);
        System.out.println(""+last+three+three3);





    }
}
