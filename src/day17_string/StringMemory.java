package day17_string;

public class StringMemory {
    public static void main(String[] args) {
        String first= "java"; // String literal, in String pool
        String second= new String("java"); // String object, not in String pool, but directly in the heap
        System.out.println(first == second);
        // == with String types give you false. the == doesn't compare the characters, it compares the memory location of the object.
        String third= "java";
        System.out.println(first==third);// true because they are the same object in a String pool
        // don't use == with String because it doesn't compare variable/ value but they compare memory location
        String forth="Java"; // at this point there are 2 objects in the string pool ( "java" and "Java")
        System.out.println(first==forth);
         //  at this point there are total of  3 objects: 2 in  the string pool ( "java" and "Java") and 1 in the heap ("java")

        String fifth= new String("java");// new object in heap
        System.out.println(second==fifth);
    }
}
