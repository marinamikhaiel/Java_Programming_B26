package day43_custom_classes;

public class UsePhone {
    public static void main(String[] args) {
        Phone phone1=new Phone("IPhone 11 pro");// calls the constructor on line 20
        System.out.println(phone1);

        Phone phone2=new Phone("IPhone 12 pro", "Apple");// calls the constructor on line 23
        System.out.println(phone2);

        Phone phone3=new Phone("IPhone 13 pro", "Apple", 260,10.2);
        System.out.println(phone3);

    }
}
