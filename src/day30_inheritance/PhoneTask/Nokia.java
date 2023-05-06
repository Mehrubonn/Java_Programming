package day30_inheritance.PhoneTask;

public class Nokia extends Phone{

    public Nokia(String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }

    public void selfDefense(){
        System.out.println(getBrand() + " " + getModel() + " can be used for delf defense");
    }
}
/*
Nokia:
					Extra methods:
						selfDefense()
 */