package day25_constructors;

import java.time.LocalDate;

public class TestEmployeeObjects {
    public static void main(String[] args) {

    Employee e1 = new Employee("Jake", 30, 'M', "Java Developer", 90000, LocalDate.of(2022,12,2));
    Employee e2 = new Employee("Muhammad", 33, 'M', "Project Manager", 120000, LocalDate.of(2023, 3, 4));


        System.out.println(e1);
        System.out.println(e2);
}}
