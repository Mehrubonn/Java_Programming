package day25_constructors;

import day17_customClass.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethodPractice {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[]{new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs[0].setInfo("Max", "Husky", "Medium", 'M', 4, "Gray");
        dogs[1].setInfo("Chloe", "Golden Retriever", "Large", 'F', 8, "Gold");
        dogs[2].setInfo("Molly", "Beagle", "Small", 'F', 5, "White");
        dogs[3].setInfo("Oliver", "Bulldog", "Small", 'M', 2, "Black");
        dogs[4].setInfo("Bella", "Bichon Frise", "Small", 'F', 3, "White");
        dogs[5].setInfo("Loki", "Chow Chow", "Medium", 'M', 7, "Gold");

        ArrayList<Dog> smallDogs = new ArrayList<>();
        /*for (Dog each : dogs) {
            if(each.size.equalsIgnoreCase("small")){
                smallDogs.add(each);
            }
        }

         */
        smallDogs.addAll(Arrays.asList(dogs));
        smallDogs.removeIf(p -> !p.size.equalsIgnoreCase("small"));
        System.out.println(smallDogs);

        ArrayList<Dog> youngDogs = new ArrayList<>();
        youngDogs.addAll(Arrays.asList(dogs));
        youngDogs.removeIf(p-> p.age>4);
        System.out.println(youngDogs);

    /*    for (Dog each : dogs) {
            if(each.age<=4){
                youngDogs.add(each);
            }
        }
     */

        ArrayList<Dog> femaleDogs = new ArrayList<>(Arrays.asList(dogs));
        femaleDogs.removeIf(p-> p.gender == 'M');

        System.out.println();

        ArrayList<Dog> maleDogs = new ArrayList<>(Arrays.asList(dogs));
        maleDogs.removeIf(p-> p.gender == 'F');

        System.out.println("----------------------------------------------------------");

        Dog[] dogs2 = new Dog[]{new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs2[0].setInfo("Max", "Husky", "Medium", 'M', 4, "Gray");
        dogs2[1].setInfo("Chloe", "Golden Retriever", "Large", 'F', 8, "Gold");
        dogs2[2].setInfo("Molly", "Beagle", "Small", 'F', 5, "White");
        dogs2[3].setInfo("Oliver", "Bulldog", "Small", 'M', 2, "Black");
        dogs2[4].setInfo("Bella", "Bichon Frise", "Small", 'F', 3, "White");
        dogs2[5].setInfo("Loki", "Chow Chow", "Medium", 'M', 7, "Gold");

        System.out.println(Arrays.asList(dogs2));
        ArrayList<Dog> bigDogs = new ArrayList<>(Arrays.asList(dogs2));
        bigDogs.removeIf(p-> p.size.equalsIgnoreCase("small"));
        dogs2 = bigDogs.toArray(new Dog[bigDogs.size()]);
        System.out.println(Arrays.asList(bigDogs));
    }
}
/*
1. Give the following array of dogs
            Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
            dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
            dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
            dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
            dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
            dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
            dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

            Note: Dog class is imported from package day17

        1.1 Create an arrayList named smallDogs, and add all the dog objects with the size of small from the dogs array to smallDogs arrayList

            Note: DO NOT use any loops

	    1.2 Create an arrayList named youngDogs, and add all the dog objects with the age of 4 or less from the dogs array to youngDogs arrayList

	            Note: DO NOT use any loops

	    1.3 Create an arrayList named femaleDogs, and add all the dog objects with the gender of 'F' the dogs array to femaleDogs arrayList

	            Note: DO NOT use any loops

	    1.4 Create an arrayList named maleDogs, and add all the dog objects with the gender of 'M' the dogs array to maleDogs arrayList

	            Note: DO NOT use any loops
 */
