package day28_encapsulation.PersonTask;

public class TestPersonObjects {
    public static void main(String[] args) {
        Person person1 = new Person("Jake");
        Person person2 = new Person("Mohammed", 'M');
        Person person3 = new Person("Hasan", 34);
        Person person4 = new Person("Bilal", 25, 'M');
        Person person5 = new Person("Lucy", 33, 'F',"English");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);

        Person.printPlanetName();
        person1.eat("Baklava");
        person2.drink("Water");
    }

    }





