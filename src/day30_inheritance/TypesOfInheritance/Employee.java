package day30_inheritance.TypesOfInheritance;

import java.time.LocalDate;

public class Employee extends Person{
    private double salary;
    private String jobTitle;
    private String employeeID;

    public Employee(String name, int age, char gender, LocalDate dateOfBirth, double salary, String jobTitle, String employeeID) {
        super(name, age, gender, dateOfBirth);
        setSalary(salary);
        setJobTitle(jobTitle);
        setEmployeeID(employeeID);
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void work(){
        System.out.println(getName()+" is working");
    }
}