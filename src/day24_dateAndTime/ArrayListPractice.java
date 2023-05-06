package day24_dateAndTime;

import day17_customClass.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(new Employee(), new Employee(), new Employee(),
                new Employee(), new Employee()));

        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

        for (Employee eachEmployee : employees) {
            System.out.println(eachEmployee.name + ":" + eachEmployee.jobTitle);
        }

        for (Employee eachEmployee : employees) {
            if (eachEmployee.jobTitle.equals("Java Developer")) {
                System.out.println(eachEmployee.name);
            }
        }

        double maxSalary = employees.get(0).salary;
        for (Employee eachEmployee : employees) {
            if (eachEmployee.salary > maxSalary) {
                maxSalary = eachEmployee.salary;
            }
        }
        System.out.println("Maximum salary: " + maxSalary);

        double minSalary = employees.get(0).salary;
        for (Employee eachEmployee : employees) {
            if (eachEmployee.salary < minSalary) {
                minSalary = eachEmployee.salary;
            }
        }
        System.out.println("Minimum salary: " + minSalary);

        System.out.println("----------------------------------------------------");
        ArrayList<Employee> maleEmployee = new ArrayList<>();
        ArrayList<Employee> femaleEmployee = new ArrayList<>();

        for (Employee eachEmployee : employees) {
            if(eachEmployee.gender == 'M'){
                maleEmployee.add(eachEmployee);
            }else {
                femaleEmployee.add(eachEmployee);
            }
        }

        System.out.println("Total number of male employees: " + maleEmployee.size());
        System.out.println("Total number of female employees: " + femaleEmployee.size());


    }}
/*
1. Given the following arraylist of Employees:
			ArrayList<Employee> employees = new ArrayList<>();
	        employees.addAll(Arrays.asList(
	               new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
	        ));

	        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
	        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
	        employees.get(1).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
	        employees.get(1).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
	        employees.get(1).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

	        Note: Employee class is imported from day17 package

	        1.1 Write a program that can display the name and job title of each employee

	        1.2 Write a program that can display the names of "Java Developers"

	        1.3 Write a progam that can display the maximum and minimum salary

	        1.4 Create two arraylists named femaleEmployees and maleEmployees, write a program that
	         can add all the female employees and male emloyees to the femaleEmployees and maleEmployees arraylists

 */
