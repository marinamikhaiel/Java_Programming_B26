package day47_encapsulation;

public class Road {
    public static void main(String[] args) {
        TrafficLight light=new TrafficLight("gray");
//        System.out.println(light.color);
//
//        light.color= "pink";

        TrafficLight light2= new TrafficLight("red");
        System.out.println(light2.getColor());
        light2.setColor("gray");
        System.out.println(light2.getColor());

        TrafficLight light3= new TrafficLight("black");
        System.out.println(light3.getColor());
    }
}
