package day19_string;

public class IndexOfMethod {
    public static void main(String[] args) {

        String s= "pen";
        System.out.println(s.indexOf("p"));//0
        System.out.println(s.indexOf("e"));//1
        System.out.println(s.indexOf("n"));//2

        System.out.println(s.indexOf("x")); // since x is not found it will return a value of -1

        System.out.println(s.indexOf("pe"));// it will give the value of the starting index which is p in this case
        System.out.println(s.indexOf("pz"));// it's not in the same sequence so it will give -1
        System.out.println(s.indexOf("pp"));


    }
}
