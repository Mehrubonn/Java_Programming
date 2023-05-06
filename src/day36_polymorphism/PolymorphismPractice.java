package day36_polymorphism;

import day30_inheritance.PhoneTask.Nokia;
import day30_inheritance.PhoneTask.Phone;
import day30_inheritance.PhoneTask.Samsung;
import day30_inheritance.PhoneTask.iPhone;

public class PolymorphismPractice {
    public static void main(String[] args) {
        Phone[] phones = {
                new iPhone("Iphone", "Large", 900, "Black"),
                new iPhone("Iphone 12 Pro Max", "Large", 1200, "Black"),
                new iPhone("Iphone 9", "Medium", 800,  "Gold"),
                new Samsung("Galaxy S19", "Medium", 700, "Pink"),
                new Samsung("Galaxy S20", "Large", 850, "Silver"),
                new Samsung("Galaxy S21", "Large", 950, "Red"),
                new Nokia("XR20", "Small", 350,"Blue"),
                new Nokia("G10", "Medium", 99, "Gray"),
                new Nokia("G50", "Large", 250,"Silver"),
                new iPhone("Iphone 12 Pro", "Large", 1200, "Black"),
                new iPhone("Iphone 11 Pro Max", "Large", 1100, "Silver"),
                new Samsung("Galaxy S18", "Medium", 750, "White"),
                new Samsung("Galaxy S17", "Large", 990, "Green"),
                new Nokia("G10", "Medium", 99, "Black"),
                new iPhone("Iphone 6", "Small", 400, "Gold"),
                new iPhone("Iphone 7", "Small", 500, "White")
        };

        for (Phone each : phones) {
            System.out.println(each.getModel()+" - "+each.getColor()+" - "+ each.getPrice());
        }

        System.out.println("------------------------------------------");

        int countiPhone = 0,
                countSamsung=0;
        for (Phone each : phones) {
            if(each instanceof iPhone){
                countiPhone++;
            } else if (each instanceof Samsung) {
                countSamsung++;
            }
        }
        System.out.println(countiPhone);
        System.out.println(countSamsung);

        System.out.println("-------------------------------------------------------");
        for (Phone each : phones) {
            if(each instanceof iPhone || each instanceof iPhone){
                if(each.getPrice()>=700){
                    System.out.println(each.getModel());
                }
            }
        }
    }
}

/*
 1. print the model, color and price of each phone object in the following format
    				model - color - price

	2. How many Iphones in the array of phones?

	3. How many Samsungs in the array of phones?

	4. Display the models of Iphones and samsung that has the price of 700 or greater


 */

