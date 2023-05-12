package day36_polymorphism;

import day34_abstraction.CarTask.Audi;
import day34_abstraction.CarTask.Car;
import day34_abstraction.CarTask.Honda;
import day34_abstraction.CarTask.Tesla;

import java.util.ArrayList;

public class CarTask {
    public static void main(String[] args) {


        Car[] cars = {
                new Honda("Honda", "H2", "White", 2010, 25000),
                new Audi("Audi", "Q6", "Red", 2014, 32000),
                new Honda("Honda", "Accord", "White", 2011, 20000),
                new Audi("Audi", "Q4", "Blue", 2015, 33000),
                new Audi("Audi", "A7", "Black", 2019, 35000),
                new Audi("Audi", "Q8", "White", 2018, 40000),
                new Audi("Audi", "Q5", "Purple", 2009, 30000),
                new Audi("Audi", "A4", "Black", 2011, 30000),
                new Honda("Honda", "Civic", "Red", 2018, 30000),
                new Honda("Honda", "CR-V", "Red", 2012, 23000),
                new Honda("Honda", "HR-V", "Blue", 2019, 35000),
                new Tesla("Tesla", "Model 3", "White", 2015, 45000),
                new Tesla("Tesla", "Model Y", "Black", 2017, 65000),
                new Tesla("Tesla", "Model X", "White", 2016, 48000),
                new Tesla("Tesla", "Model X", "Blue", 2014, 48000),
        };

        /*
        Cars that are eligible for recall:
	        							Honda: from year 2010 to 2011
         */
        for (Car each : cars) {
            if (each.getMake().equalsIgnoreCase("honda") && each.getYear() >= 2010 && each.getYear() <= 2011) {
                System.out.println(each.getMake() + " " + each.getModel() + ", " + each.getYear());
            }
        }

        System.out.println("----------------------------------------------------");
        /*
        Audi: from year 2015 to 2019
         */
        for (Car each : cars) {
            if (each.getMake().equalsIgnoreCase("audi") && each.getYear() >= 2015 && each.getYear() <= 2019) {
                System.out.println(each.getMake() + " " + each.getModel() + ", " + each.getYear());
            }

        }
        System.out.println("----------------------------------------------------");

        //Tesla: from year 2015-2016
        for (Car each : cars) {
            if (each.getMake().equalsIgnoreCase("tesla") && each.getYear() >= 2015 && each.getYear() <= 2016) {
                System.out.println(each.getMake() + " " + each.getModel() + ", " + each.getYear());
            }
        }
        System.out.println("----------------------------------------------------");

        //Write a program that can display the car that has the highest price
        Car carMaxPrice = cars[0];

        for (Car each : cars) {
            if(each.getPrice()>carMaxPrice.getPrice()){
                System.out.println(each.getMake()+" "+each.getModel()+ " "+ each.getPrice());
            }
        }
        System.out.println("----------------------------------------------------");

        //Write a program that can display the car that has the lowest price
        Car carMinPrice = cars[0];
        for (Car each : cars) {
            if(each.getPrice()<carMinPrice.getPrice()){
                System.out.println(each.getMake()+" "+each.getModel()+ " "+ each.getPrice());
            }
        }
        System.out.println("----------------------------------------------------");

        /*
        Create an arraylist of Tesla named teslaCars and store all the tesla cars from cars array to the arrayList:
						ArrayList<Tesla> teslaCars = new ArrayList<>()
         */

        ArrayList<Tesla> teslaCars = new ArrayList<>();
        for (Car each : cars) {
            if(each instanceof Tesla){
                teslaCars.add((Tesla)each);
            }
        }
        System.out.println(teslaCars);

    }
}
/*
 1.2 Write a program that can display all the cars that are eligible for recall

	        					Cars that are eligible for recall:
	        							Honda: from year 2010 to 2011
	        							Audi: from year 2015 to 2019
	        							Tesla: from year 2015-2016

			1.3 Write a program that can display the car that has the highest price

			1.3 Write a program that can display the car that has the lowest price

			1.4 Create an arraylist of Tesla named teslaCars and store all the tesla cars from cars array to the arrayList:
						ArrayList<Tesla> teslaCars = new ArrayList<>()

 */