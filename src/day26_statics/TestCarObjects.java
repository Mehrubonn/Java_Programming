package day26_statics;

public class TestCarObjects {
    public static void main(String[] args) {
        Car car1 = new Car("BMW");
        System.out.println(car1);

        Car car2 = new Car("Audi", "Q4");
        System.out.println(car2);

        Car car3 = new Car("Toyota", "Camry", 2020);
        System.out.println(car3);

        Car car4 = new Car("Honda", "Accord", 2021, 30000);
        System.out.println(car4);

        Car car5 = new Car("Lexus", "RX3", 2019, 40000, "Black");
        System.out.println(car5);







    }
}
