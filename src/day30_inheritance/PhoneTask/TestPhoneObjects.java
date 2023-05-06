package day30_inheritance.PhoneTask;

public class TestPhoneObjects {
    public static void main(String[] args) {
        Nokia n1 = new Nokia("F2", "Small", 432, "Black");
        System.out.println(n1);
        Samsung s = new Samsung("S20", "M", 456, "Silver");
        System.out.println(s);
    }
}
