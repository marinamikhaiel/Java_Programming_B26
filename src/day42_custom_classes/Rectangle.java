package day42_custom_classes;

public class Rectangle {
    /*
    Create a class Rectangle

create instance variables:
    base, height, perimeter, area

create instance methods:

    - toString(): [return String]
        returns all the information of the Rectangle objects, including the perimeter and area

    - calculatePerimeter(): [void]
        calculate the perimeter and store the result into the perimeter instance variable

        a perimeter of a rectangle is the 4 sides added together

    - calculateArea(): [void]
        calculate the area and store the result into the area instance variable

        an area of a rectangle is the height x width

Create a separate class to create Rectangle objects and test the methods created

     */

    double base;
    double height;
    double perimeter;
    double area;

    @Override
    public String toString() {
        return "base=" + base +
                ", height=" + height +
                ", perimeter=" + perimeter +
                ", area=" + area ;

    }
    public void calculatePerimeter(){
        System.out.println("Perimeter= "+perimeter);
        perimeter=(base+height)*2;
        return;


    }
    /*
    - calculateArea(): [void]
        calculate the area and store the result into the area instance variable

        an area of a rectangle is the height x width
     */
    public void calculateArea(){
        System.out.println("Area= "+area);
        area=base*height;
        return;
    }
}
