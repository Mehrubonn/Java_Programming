package day36_polymorphism;

import day29_inheritance.AnimalClass.Animal;
import day29_inheritance.AnimalClass.Cat;
import day29_inheritance.AnimalClass.Dog;
import day30_inheritance.PhoneTask.Nokia;
import day30_inheritance.PhoneTask.Phone;
import day33_abstraction.EmployeeTask.*;
import day35_polymorphism.transportationTask.AutoPilot;
import day35_polymorphism.transportationTask.Electric;
import day35_polymorphism.transportationTask.Tesla;

public class ReferenceTypeCastings {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //Cat cat = new Dog();
        Animal animal = new Dog(); //implicit casting

        System.out.println("---------------------------------------------------------------");
        Animal animal1 = new Dog();
        animal1.setInfo("Max", "Husky", 'M', 4, "Large", "Grey");
        animal1.eat();
        animal1.drink();
        animal1.sleep();

        ((Dog)animal1).bark(); //down casting

     //   Dog dog1 = (Dog) animal1; //down casting
     //   dog1.bark();

      //  ((Cat)animal1).scratch();   Dog con not be converted to Cat, because there is no is-a relationship between dog and cat

        System.out.println("------------------------------------------------------");

        Phone phone = new Nokia("K9", "Small", 299, "Olive");

        phone.call(000);
        phone.text(8765);
        ((Nokia) phone).selfDefense();

      //  ((iPhone) phone.faceTime(34254213); //Nokia can not be converted to iPhone because there is no is-a relationship between Nokia and iPhone

        System.out.println("--------------------------------------------------------");
        Employee employee = new Developer("Lucy", 29, 'F', "F456", "Java Developer", 25000, "Java");

        employee.work();

        System.out.println(((Developer) employee).getProgrammingLanguage());
       // Tester tester = (Tester) employee;

        System.out.println("-------------------------------------------------------");

        Electric electric = new Tesla("Tesla", "Y", "Blue", 2022, 43000);
        electric.charge();

        System.out.println("--------------------------------------------------------------");

        Employee employee1 = new Teacher("James", 31, 'M', "A324", "Math Teacher", 21000);

        Employee employee2 = new Developer("Lucy", 29, 'F', "F456", "Java Developer", 25000, "Java");

        Employee employee3 = new Driver("George", 40, 'M', "D333", "Truck driver", 90000);

        Employee employee4 = new Tester("Me", 25, 'F', "L6467", "QA", 100000);

        employee1.work();
        employee2.work();
        employee3.work();
        employee4.work();

    }
}









