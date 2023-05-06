package day35_polymorphism;

import day31_inheritance.Shape_methodOverriding.Circle;
import day31_inheritance.Shape_methodOverriding.Shape;
import day33_abstraction.EmployeeTask.Developer;
import day33_abstraction.EmployeeTask.Driver;
import day33_abstraction.EmployeeTask.Employee;
import day33_abstraction.EmployeeTask.Tester;
import day34_abstraction.AnimalTask.*;
import day34_abstraction.CarTask.Audi;
import day34_abstraction.CarTask.Honda;
import day34_abstraction.CarTask.Tesla;

import java.util.Arrays;

public class PolymorphismIntro {
    public static void main(String[] args) {
        Dog dog = new Dog("Max", "Husky", 'M', 4, "Small", "White");
        Cat cat = new Cat("Mu", "Tas", 'F', 3, "Medium", "Yellow");
        Tiger tiger=null;
        Eagle eagle=null;
        Lion lion=null;
        Parrot parrot = null;
        Dolphin dolphin = null;
        Shark shark = null;
        Duck duck = null;

        Animal[] animals = {dog, cat, eagle, lion, parrot, dolphin, shark, duck};
       // Animal animal = new Tesla();     There is no is-a relationship between Animal and Tesla

        Animal animal = new Dog("Max", "Husky", 'M', 4, "Small", "White");
        animal.eat();
        animal.drink();
        animal.sleep();

       // animal.play();
       // animal.bark();

        System.out.println("--------------------------------------------------------------------------------");

        String str = "Java";
        Integer n = 100;
        Boolean r = false;
        Double d = 10.6;
        Circle circle = new Circle("Circle", 5);

        Honda honda = new Honda("Honda", "Pilot", "Black", 2019, 35000);
        Audi audi = new Audi("Audi", "Q6", "Silver", 2022, 60000);
        Tesla tesla = new Tesla("Tesla", "Model Y", "Blue", 2023, 60000);

        Object [] objects = {str, n, r, d, circle, honda, audi, tesla};

        System.out.println(Arrays.toString(objects));


        Developer developer = new Developer("Lucy", 29, 'F', "F456", "Java Developer", 25000, "Java");

        Driver driver = new Driver("George", 40, 'M', "D333", "Truck driver", 90000);

        Tester tester = new Tester("Me", 25, 'F', "L6467", "QA", 100000);

        Employee[] employees = {developer, driver, tester};

        Employee obj = new Driver("George", 40, 'M', "D333", "Truck driver", 90000);

        obj.work();

        System.out.println("------------------------------------------------------------");

        Tesla car1 = new Tesla("Tesla", "U", "White", 1999, 40000);

        car1.start();











    }
}











