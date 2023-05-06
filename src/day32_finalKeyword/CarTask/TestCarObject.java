package day32_finalKeyword.CarTask;

public class TestCarObject {
    public static void main(String[] args) {
        Toyota toyota = new Toyota("Camry", "Blue", 2020, 54000);
        Honda honda = new Honda("Accord", "Grey", 2019, 43000);
        Audi audi = new Audi("Q6", "Silver", 2021, 45000);
        BMW bmw = new BMW("X6", "Black", 2017, 60000);
        Tesla tesla = new Tesla("Model 3", "White", 2022, 70000);

        System.out.println(toyota);
        System.out.println(honda);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(tesla);

        System.out.println("-----------------------------------------------------");

        toyota.start();
        honda.start();
        audi.start();
        bmw.start();
        tesla.start();

        System.out.println("-------------------------------------------------------");

        //tesla.setModel("X");
        //tesla.setPrice(10000);
        System.out.println(tesla);
    }
}
