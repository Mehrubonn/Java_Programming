package day36_polymorphism;

public class TestEqualsMethod {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(3);
        Circle circle3 = new Circle(13);

        System.out.println(circle1 == circle2); //false
        System.out.println(circle1.equals(circle2)); //true
        System.out.println(circle1.equals(circle3)); // false

        System.out.println("---------------------------------------------------------");

        IPhones iphone1 = new IPhones("Apple", "iPhone 12", "Medium", 980, "Black");
        IPhones iphone2 = new IPhones("Apple", "iPhone 12", "Medium", 980, "Black");

        System.out.println(iphone1.equals(iphone2));
    }
}








