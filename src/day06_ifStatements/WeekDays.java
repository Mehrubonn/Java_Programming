package day06_ifStatements;

public class WeekDays {

    public static void main(String[] args) {

        int number = 1;

        String weekDay = "";

        if(number == 1){
            weekDay = "Monday";
        }

        if(number == 2){
            weekDay = "Tuesday";
        }

        if(number == 3){
            weekDay = "Wednesday";
        }

        if(number == 4){
            weekDay = "Thursday";
        }

        if(number == 5){
            weekDay = "Friday";
        }

        if(number == 6){
            weekDay = "Saturday";
        }

        if(number == 7){
            weekDay = "Sunday";
        }

        System.out.println(weekDay);
    }
}


/*
1. Create a class named WeekDays.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the day that the number represents
Ex:
Given:
number = 1
output:
Monday
Hint: Assume that a number between 1 ~ 7 is given to the variable
 */