package day34_abstraction;

import day34_abstraction.AnimalTask.Playable;
import day34_abstraction.AnimalTask.Swimable;

public class Person implements Swimable, Playable {
    @Override
    public void play() {
        System.out.println("A person is playing");
    }

    @Override
    public void Swim() {
        System.out.println("A person is swimming");
    }
}
