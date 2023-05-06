package day30_inheritance.TypesOfInheritance;

import utilities.Test;

import java.time.LocalDate;

public class TestPersonObjects {
    public static void main(String[] args) {
        Student student = new Student("Lucy", 32, 'F', LocalDate.of(1992,3,4), 'A', "D32");
        President president = new President("Daniel", 54, 'M', LocalDate.of(1980,5,6));
        Teacher teacher = new Teacher("Emily", 43, 'F', LocalDate.of(1990,5,6), 435432, "Math teacher", "G5432");

        System.out.println(student);
        System.out.println(president);
        System.out.println(teacher);

        president.lie();
        student.study();
        teacher.teach();
        student.eat("Plov");
    }
}
