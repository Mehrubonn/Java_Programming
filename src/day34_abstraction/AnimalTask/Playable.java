package day34_abstraction.AnimalTask;

public interface Playable {
    boolean isFriendly=true; //static & final

    /*
    private static void main(String[] args) {
       // isFriendly=false;
        System.out.println(isFriendly);
    }

    default void method(){

    }
     */

    void play(); //abstract


}
