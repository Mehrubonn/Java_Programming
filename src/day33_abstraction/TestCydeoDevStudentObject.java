package day33_abstraction;

import java.time.LocalDate;

public class TestCydeoDevStudentObject {
    public static void main(String[] args) {
        CydeoDevStudent student1 = new CydeoDevStudent("Daniel", 'M', LocalDate.of(1988, 11, 3), "A11", "Alumni Dev", 45);

        System.out.println(student1);
        student1.sleep();
        student1.drink();
    }
}





