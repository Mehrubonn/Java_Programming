package day28_encapsulation.Encapsulation;

public class TestEmployeeObject {
    public static void main(String[] args) {

      /*
        Employee employee1 = new Employee;
        employee1.setSalary(100000);
        System.out.println(employee1.getSalary());

        employee1.setName("            ");
        System.out.println(employee1.getName());

       */
        Employee employee1 = new Employee("Myhatr", 20, "SDET", 1299999);
        System.out.println(employee1);



    }
}





