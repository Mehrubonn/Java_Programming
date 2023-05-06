package day34_abstraction.AnimalTask;

public class Dolphin extends Animal implements Playable, Swimable{
    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Dolphin " + getName() + " is eating fish");
    }

    @Override
    public void play() {
        System.out.println("Dolphin " + getName()+" is playing");
    }

    @Override
    public void Swim() {
        System.out.println("Dolphin "+getName()+" is swimming");
    }
}


