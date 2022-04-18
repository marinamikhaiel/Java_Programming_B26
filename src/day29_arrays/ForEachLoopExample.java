package day29_arrays;

public class ForEachLoopExample {
    public static void main(String[] args) {

        int[] nums= {30,12,159,12};

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Traditional: " +nums[i]);
        }
        System.out.println();

        for (int elements: nums){
            System.out.println("For each: "+ elements);
        }

        // String example

        String []classes={"java","soft skills","selenium","database","api"};

        for (int i = 0; i < classes.length; i++) {
            System.out.println("traditional: "+ classes[i]);
        }
        System.out.println();

        for (String clas :classes){
            System.out.println("For each: "+clas);
        }


        // double example
        System.out.println();
        double[]prices={10.4,40.2,410.2};
        for (double each:prices) {
            System.out.println("for each: $"+each);
        }
    }
}
