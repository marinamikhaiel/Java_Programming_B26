package my_utilities;

import day47_encapsulation.AccessModifier;

public class AccessOutSidePackage {

    // different class, different package
    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);
     //   System.out.println(obj.b);
    //    System.out.println(obj.c);

        System.out.println(AccessModifier.x);
       // System.out.println(AccessModifier.y);
       // System.out.println(AccessModifier.z);

        // c and z were not accessible outside the class because they were private

        // b and y are default ( didn't have any other access modifier), so they can be accessed in the same package

        // so what is accessible outside a package:
        // public
    }
}

