package day21_loops;

public class ReplaceMethod {
    public static void main(String[] args) {

        String s= "java is a language";

        s= s.replace('a','e');
        System.out.println(s);

        String day= "Today is monday";
        day= day.replace("monday", "Tuesday");
        System.out.println(day);

        String str= "Today is monday. we will start the week on monday. office hours is on monday";
        System.out.println(str.replaceFirst("monday","Tuesday"));

        String target= "Today is monday. we will start the week on monday. office hours is on monday";

        int firstIndex= target.indexOf('.');
        int secondIndex= target.lastIndexOf('.');
        String middleStr= target.substring(firstIndex, secondIndex);
        middleStr= middleStr.replace("monday","weekday");

        System.out.println(target.substring(0, firstIndex)+ middleStr+ target.substring(secondIndex));

    }
}
