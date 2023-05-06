package day06_ifStatements;

public class NumberOfDays {

    public static void main(String[] args) {

        int number = 10;

        boolean has28Days = number == 2; // If the month number is 2 (February), then it has 28 days
        boolean has30Days = number == 4 || number == 6 || number == 9 || number == 11;
        boolean has31Days = !has28Days && !has30Days;
         // If the month does not have 28 days and also does not have 30 days, then the month has 31 days


        if(has28Days){
            System.out.println("28 days");
        }

        if(has30Days){
            System.out.println("30 days");
        }

        if(has31Days){
            System.out.println("31 Days");
        }





    }
}


/*
1. Create a class named NumberOfDays.java
2. An integer variable named month is declared and given, Write a
program that can print the number of days in the given month
Ex:
Given:
number = 1
output:
31 days
Hints:
Months that has 31 days are: 1, 3, 5, 7, 8, 10, 12
Months that has 30 days are: 4, 6, 9, 11
Month that has 28 days: 2
 */