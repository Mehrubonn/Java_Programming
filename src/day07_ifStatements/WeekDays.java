package day07_ifStatements;

public class WeekDays {

    public static void main(String[] args) {

        int number = 9;
        String result = "";
        if (number >= 1 && number <= 7) {

            if (number == 1) {
                System.out.println("Monday");
            } else if (number == 2) {
                System.out.println("Tuesday");
            } else if (number == 3) {
                System.out.println("Wednesday");
            } else if (number == 4) {
                System.out.println("Thursday");
            } else if (number == 5) {
                System.out.println("Friday");
            }else if (number == 6) {
                System.out.println("Saturday");
            } else if (number == 7) {
                System.out.println("Sunday");
            }
        }else{
            System.out.println("Invalid number");
        }




    }
}


/*
1. Create a class named WeekDays.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the day that the number represents.
Ex:
Given:
number = 1
output:
Monday
Note: Assume that the given number is between 1 ~ 7

 */