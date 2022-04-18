package day19_string;

public class IndexOfMethod2 {
    public static void main(String[] args) {

        String s= "java";
        System.out.println(s.indexOf('a'));// it will give the value of the first one
        System.out.println(s.lastIndexOf('a')); // it reads from the end

        String s2="abcbcb";

        System.out.println(s2.indexOf('b'));// 1
        System.out.println(s2.lastIndexOf('b'));// 5

        System.out.println(s2.indexOf("cb"));//2
        System.out.println(s2.indexOf("cbd")); //-1


    }
}
