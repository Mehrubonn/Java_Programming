package day31_inheritance.Animal_methodOverriding;

public class TestAnimalObjects {
    public static void main(String[] args) {
        Cat cat = new Cat("Bo", "Bengle", 'M', 4, "Small", "White");
        Dog dog = new Dog("He", "Husky", 'M', 3, "Large", "Black");
        Lion lion = new Lion("Simbo", "American", 'M', 2, "Medium", "Black");
        Eagle eagle = new Eagle("Ga", "American Eagle",'F', 1, "Small", "Brown");

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);
        System.out.println(eagle);

        System.out.println("--------------------------------------------------------");

        cat.eat();
        dog.eat();
        eagle.eat();
        lion.eat();

        System.out.println("---------------------------------------------------------------");

        cat.sleep();
        dog.sleep();
        lion.sleep();
        eagle.sleep();











    }
}







