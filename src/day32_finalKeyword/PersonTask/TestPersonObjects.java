package day32_finalKeyword.PersonTask;

import java.time.LocalDate;

public class TestPersonObjects {
    public static void main(String[] args) {
        Person person = new Person("Daniel", 'M', LocalDate.of(1991, 1,20));
        System.out.println(person);
        person.breath();

        System.out.println("------------------------------------------------------");

        Employee employee = new Employee("Emily", 'F', LocalDate.of(1992, 6, 12), "Accountant", 1000000);
        System.out.println(employee);
        employee.breath();

        System.out.println("------------------------------------------------");

        Student student = new Student("Kevin", 'M', LocalDate.of(1998, 5,5), 'A', "F45");
        System.out.println(student);
        student.breath();
    }
}





