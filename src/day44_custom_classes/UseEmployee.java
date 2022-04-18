package day44_custom_classes;

public class UseEmployee {
    public static void main(String[] args) {
        Employee employee1=new Employee("James","SDET");
        System.out.println(employee1);
        Employee employee2=new Employee("Marina",192364,"SDET",120_000);
        System.out.println(employee2);

        employee1.goToMeeting();
        employee2.goToMeeting();
    }
}
