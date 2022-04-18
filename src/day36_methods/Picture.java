package day36_methods;

public class Picture {

    public static void draw() {
        System.out.println("Trying to draw");
    }

    public static void draw(String color) {
        System.out.println("Draw with " + color);
    }

    public static void draw(String color, String color2) {
        System.out.println("Drawing with color " + color + " and with " + color2);
    }

    public static void draw(int size){
        System.out.println("Drawing with size "+size);
    }
    // not valid by just changing the parameter name, but if you added two int parameters then it would work
//    public static void draw(int length){
//        System.out.println("Drawing with size "+length);
//    }
    public static void draw(String color, int size){
        System.out.println("Color with size");
    }
    public static void draw(int size, String color){
        System.out.println("Size first , then color");

    }


}
