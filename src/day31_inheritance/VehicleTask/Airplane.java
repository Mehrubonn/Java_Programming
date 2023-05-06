package day31_inheritance.VehicleTask;

public class Airplane extends Vehicle{

    public Airplane(String brand, String model, int year, String color, double price) {
        super(brand, model, year, color, price);
    }

    public void fly(){
        System.out.println("Flying in " + getBrand() + ", " + getModel());
    }
}
/*
5. Create a sub class of Vehicle named AirPlane

			Extra methods:
				fly()
 */





