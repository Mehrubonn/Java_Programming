package day26_statics;

public class TestIphoneObjects {
    public static void main(String[] args) {

        iPhone iPhone1 = new iPhone("iPhone12", "Black", 1000);

        System.out.println(iPhone1.model);
        System.out.println(iPhone1.color);
        System.out.println(iPhone1.price);

        iPhone1.printPhoneInfo();

        System.out.println(iPhone.brand);
        System.out.println(iPhone.OS);
        iPhone.printOperatingSystem();
    }














}
