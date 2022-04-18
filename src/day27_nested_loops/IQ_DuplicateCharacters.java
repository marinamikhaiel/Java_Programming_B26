package day27_nested_loops;

public class IQ_DuplicateCharacters {
    /*
    [IQ] Duplicate characters

Given a String, find and print the duplicate characters. A character is duplicate if it appears more than once in the String.

Ex:
	Input:
		AAABCCDEEF
	Output:
		ACE

	-> the characters A C and E are found in the String multiple times so they are duplicates
     */
    public static void main(String[] args) {
         String str= "AAABCCDEEF";
         String checked="";



        for (int i = 0; i < str.length(); i++) {
            int count=0;
            char letter= str.charAt(i);
            if (checked.contains(""+ letter)){

            }


            for (int j = 0; j < str.length(); j++) {
                char inner = str.charAt(j);
                if (letter==inner){
                    count++;

                }
            }
            if (count!=1){
                System.out.print(letter);
            }
            checked+=letter;
        }
        System.out.println();
    }
}
/*


        String str = "AAABCCDEEF";
        String checked = "";

        for(int i = 0; i < str.length(); i++){

            if(checked.contains("" + str.charAt(i))){
                continue;
            }

            int count = 0;

            for(int j = 0; j < str.length(); j++){

                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }

            }

            if(count > 1) { // count >= 2 or count != 1
                System.out.print(str.charAt(i));
            }
            checked += str.charAt(i);

        }



    }
}

 */