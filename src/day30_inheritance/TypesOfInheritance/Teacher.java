package day30_inheritance.TypesOfInheritance;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Teacher extends Employee{
    public Teacher(String name, int age, char gender, LocalDate dateOfBirth, double salary, String jobTitle, String employeeID) {
        super(name, age, gender, dateOfBirth, salary, jobTitle, employeeID);
    }

    public void teach(){
        System.out.println(getName() + " is teaching");
    }
}



