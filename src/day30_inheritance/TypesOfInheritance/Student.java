package day30_inheritance.TypesOfInheritance;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Student extends Person{
    private char grade;
    private String studentID;

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void study(){
        System.out.println(getName()+" is studying");
    }

    public Student(String name, int age, char gender, LocalDate dateOfBirth, char grade, String studentID) {
        super(name, age, gender, dateOfBirth);
        setGrade(grade);
       setStudentID(studentID);



    }
}
