package day18_garbageCollection;

import day17_customClass.Dog;

public class GarbageCollection {
    public static void main(String[] args) {

        String s1 = "Java";
        s1 = null; // "Java" will be eligible for garbage collector

        System.out.println(s1);

    //    System.out.println(s1.toLowerCase());

      //  System.out.println(s1.replace(null, "Python"));

        String a = "";  //object
        String b = null; // nothing

   System.out.println("-------------------------------------------------------");

   String str1 = "Python";
   str1 = "Cydeo";
        System.out.println(str1);

        System.out.println("=======================================================");

        Dog dog1 = new Dog();
        dog1.setInfo("Loki", "Chow chow", "Medium", 'M', 3, "Black");

        Dog dog2 = new Dog();
        dog2.setInfo("Chuck", "Buldog", "Large", 'M', 5, "White" );

        dog1 = dog2;

        System.out.println(dog1);
        System.out.println(dog2);


        // new Dog().finalize();













    }
}









