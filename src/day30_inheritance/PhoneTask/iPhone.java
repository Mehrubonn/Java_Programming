package day30_inheritance.PhoneTask;

public class iPhone extends Phone{ //iPhone is a Phone

    public static boolean hasApplePay = true;

    public iPhone(String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }


    public void faceTime(long phoneNumber){
        System.out.println(getModel()+" is face timing with " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(getModel() + " is facing time with " + email);
    }

}
/*
2.1 Iphone:
					Extra methods:
						faceTime(phoneNumber)
						faceTime(email)
 */