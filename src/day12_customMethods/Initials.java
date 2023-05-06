package day12_customMethods;

public class Initials {
    public static void main(String[] args) {

        Initials("Mehrubon", "Abdusamieva");

    }
    // create a method that can display the initials of a person (firstName, lastName)
    public static void Initials (String firstName, String lastName){

        String initial = firstName.charAt(0) + "." + lastName.charAt(0);

        System.out.println("Initial is: " + initial);
    }

}






