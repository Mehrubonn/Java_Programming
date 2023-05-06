package day34_abstraction.AnimalTask;

public class Shark extends Animal implements WildAnimal, Swimable{
    public Shark(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Shark " + getName() + " is eating fish");
    }

    @Override
    public void Hunt() {
        System.out.println("Shark "+getName()+" is hunting");
    }

    @Override
    public void Swim() {
        System.out.println("Shark "+getName()+" is swimming");
    }
}


