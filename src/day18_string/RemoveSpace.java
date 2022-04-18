package day18_string;

public class RemoveSpace {
    public static void main(String[] args) {
        String str= "    Saturday    ";
        System.out.println(str);
        System.out.println(str.length());

        str=str.trim();// removes the spaces in the beginning and the end only

        System.out.println(str);
        System.out.println(str.length());

        String str2= "        java is fun           ";
        System.out.println(str2.startsWith("java"));// false because it starts with space
        System.out.println(str2.trim());
        str2= str2.trim();
        System.out.println(str2.startsWith("java"));// true  because it got trim first and removed the spaces at the beginning

    }
}
