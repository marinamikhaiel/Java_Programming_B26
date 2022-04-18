package day42_custom_classes;

import day42_custom_classes.Rectangle;

public class UsingRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1=new Rectangle();

        rectangle1.height=10;
        rectangle1.base=5;

        rectangle1.calculatePerimeter();
        rectangle1.calculateArea();
        System.out.println(rectangle1);


    }
}
