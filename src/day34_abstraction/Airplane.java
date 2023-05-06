package day34_abstraction;

import day34_abstraction.AnimalTask.Flyable;

public class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Airplane is flying");
    }
}
