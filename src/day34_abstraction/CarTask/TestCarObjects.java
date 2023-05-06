package day34_abstraction.CarTask;

public class TestCarObjects {
    public static void main(String[] args) {
        // Car car = new Car("X6", "Red", 2020, 45000);

        Honda honda = new Honda("Honda", "Pilot", "Black", 2019, 35000);
        Audi audi = new Audi("Audi", "Q6", "Silver", 2022, 60000);
        Tesla tesla = new Tesla("Tesla", "Model Y", "Blue", 2023, 60000);
        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("---------------------------------------------------------");

        honda.stop();
        audi.stop();
        tesla.stop();

        System.out.println("---------------------------------------------------------");

        audi.start();
        honda.start();
        tesla.start();

        System.out.println("---------------------------------------------");

        audi.autoPark();
        tesla.autoPilot();













    }












}
