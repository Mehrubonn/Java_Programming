package day32_finalKeyword.PersonTask;

import java.time.LocalDate;

public final class Student extends Person{
    private char grade;
    private String studentId;

    public Student(String name, char gender, LocalDate dateOfBirth, char grade, String studentId) {
        super(name, gender, dateOfBirth);
        this.grade = grade;
        this.studentId = studentId;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                "grade=" + grade +
                ", studentId='" + studentId + '\'' +
                '}';
    }
}
