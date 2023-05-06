package day33_abstraction.EmployeeTask;

public class TestEmployeeObjects {
    public static void main(String[] args) {
      //  Employee employee = new Employee("Daniel", 32, 'M', "K6", "Dev", 767888);
        //We can not create objects from an abstract class, Object must be created from a concrete class

        Teacher teacher = new Teacher("James", 31, 'M', "A324", "Math Teacher", 21000);

        Developer developer = new Developer("Lucy", 29, 'F', "F456", "Java Developer", 25000, "Java");

        Driver driver = new Driver("George", 40, 'M', "D333", "Truck driver", 90000);

        Tester tester = new Tester("Me", 25, 'F', "L6467", "QA", 100000);

        System.out.println(teacher);
        System.out.println(driver);
        System.out.println(developer);
        System.out.println(tester);

        System.out.println("----------------------------------------------------");
        teacher.work();
        developer.work();
        tester.work();
        driver.work();

    }
}
