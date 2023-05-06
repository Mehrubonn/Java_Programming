package day28_encapsulation.Encapsulation;

import day28_encapsulation.Encapsulation.Student;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        //student.age = -200;

      //  System.out.println(student.age);

        student.setAge(78);
        System.out.println(student.getAge());

        System.out.println("Test Completed");


        student.setName("Loll");
        System.out.println(student.getName());
    }
}










