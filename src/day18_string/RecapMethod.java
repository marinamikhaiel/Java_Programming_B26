package day18_string;

public class RecapMethod {
    public static void main(String[] args) {
        String s= "pen";
        String s2= new String("pen");

        System.out.println("Compare with ==" + (s == s2)); // the memory/ location is being compared
        System.out.println("Compare with .equals() " + s.equals(s2)); // the value "pen" is being compared

        System.out.println("Compare with .equals "+s.equals("Pen"));
        System.out.println("Compare with .equalsIgnoreCase " +s.equalsIgnoreCase("Pen"));

        boolean isSame= s.equalsIgnoreCase("PEN");
        if (s.equals("pen")){

        }
        int len= s.length();
        System.out.println(len);

        if(s.length()>4){
            System.out.println("long word");
        }else{
            System.out.println("short word");
        }

    }
}
