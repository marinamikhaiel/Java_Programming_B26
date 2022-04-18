package day42_custom_classes;

public class AllPeople {

    public static void main(String[] args) {

        // these are not valid ways to access instance variable
//        System.out.println(name);
//        System.out.println(age);
//        System.out.println(Person.name);
//        System.out.println(Person.age);

        // creating objects of the Person class
        Person personOne=new Person();// creates an object of the Person class

        Person personTwo=new Person();// creating another object

        // Accessing the instance variables of personOne and assigned them

        personOne.name="James";
        personOne.age=40;
        personOne.height=5.10;
        personOne.isMarried=false;

        // printing the instance variables
        System.out.println(personOne.name);
        System.out.println(personOne.age);
        System.out.println(personOne.height);
        System.out.println(personOne.isMarried);

        System.out.println();

        // printing the instance variables for personTwo which were not assigned so they are returning the default value.
        System.out.println(personTwo.name);
        System.out.println(personTwo.age);
        System.out.println(personTwo.height);
        System.out.println(personTwo.isMarried);






    }

}
