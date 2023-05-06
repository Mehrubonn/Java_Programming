package day12_customMethods;

import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String first = input.next().trim();

        System.out.println("Enter your last name:");
        String last = input.next().trim();

        String firstChar = first.substring(0,1).toUpperCase();
        String fName = first.substring(1).toLowerCase();
        String firstName = firstChar + fName;

        String secondChar = last.substring(0,1).toUpperCase();
        String sName = last.substring(1).toLowerCase();
        String lastName = secondChar + sName;

        input.close();
        System.out.println(firstName + " " + lastName);


    }
}
/*
1. Write a program that asks user to enter first and last names,
and then prints the full name in regular format (first character in upper case)

	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";

	                    output:
	                        Cydeo School

 */