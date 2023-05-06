package day35_polymorphism;

import day33_abstraction.CydeoDevStudent;
import day34_abstraction.AnimalTask.*;
import day34_abstraction.CarTask.Audi;
import day34_abstraction.CarTask.Car;
import day34_abstraction.CarTask.Tesla;
import day35_polymorphism.transportationTask.AutoPark;
import day35_polymorphism.transportationTask.AutoPilot;
import day35_polymorphism.transportationTask.CydeoCar;
import day35_polymorphism.transportationTask.Electric;

public class PolymorphismPractice {
    public static void main(String[] args) {
        Animal tiger = new Tiger("Sher", "Bengal", 'M', 5, "Large", "Orange");

        tiger.eat();
       // tiger.Hunt();
        tiger.drink();
        tiger.sleep();

        Animal animal = new Eagle("John", "American", 'M', 3, "Small", "Brown");
      //  animal.fly();

        animal.sleep();
        animal.drink();
        animal.eat();

        Flyable obj1 = new Eagle("John", "American", 'M', 3, "Small", "Brown");
        obj1.fly();
        //obj1.eat();
        //obj1.sleep();
        //obj1.drink();

        Lion lion = null;
        Parrot parrot = null;

        Shark shark = null;

        Dolphin dolphin = null;
        Eagle eagle = null;

        Duck duck = null;

        Dog dog = null;

        Cat cat = null;

        CydeoCar cydeoCar = null;

        Flyable[] birds = {parrot, eagle, duck, cydeoCar};
        Swimable[] fishes = {dolphin, shark, cydeoCar};
        Playable[] friendlyAnimals = {dog, cat, duck};


        boolean isAnimal = dog instanceof Animal;
        System.out.println(isAnimal);

        Car car = new Tesla("Tesla", "Model Y", "White", 2022, 32000);

        boolean isTesla = car instanceof Tesla;
        boolean isAudi = car instanceof Audi;
        boolean isElectricCar = car instanceof Electric;
        boolean hasAutoPark = car instanceof AutoPark;
        boolean hasAutoPilot = car instanceof AutoPilot;

        System.out.println("isTesla = " +isTesla);
        System.out.println("isAudi = "+isAudi);
        System.out.println("isElectric = "+isElectricCar);
        System.out.println("hasAutoPark = " + hasAutoPark);
        System.out.println("hasAutoPilot = "+hasAutoPilot);

        System.out.println("----------------------------------------------------------");

    }
}



