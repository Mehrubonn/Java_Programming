package day07_ifStatements;

import javax.print.attribute.standard.PresentationDirection;

public class GradeLevel {

    public static void main(String[] args) {

        int gradeLevel = 2; // 1-18
        String schoolType = "";

        if(gradeLevel<=5) { // false: gradeLevel >= 6
            schoolType = "Elementary school";
        }else if(gradeLevel<=8) { // false: gradeLevel >= 9
            schoolType = "Middle school";
        } else if (gradeLevel <= 12) { // false: gradeLevel >= 13
            schoolType = "High school";
        } else if (gradeLevel<=16) { // false: gradeLevel >= 17
            schoolType = "College";
        }else{
            schoolType = "Grad school";
        }

        System.out.println(schoolType);
    }


    }



/*
1. Create a class named GradeLevel.java
2. An integer variable named gradeLevel is declared and given, Write a
program to determine and print which school type someone is in.
Ex:
gradeLevel = 2
output:
Elementary School
The grade level and types are:
1 ~ 5: Elementary school
6 ~ 8: Middle school
9 ~ 12: High school
13 ~ 16: College
17 ~ 18: Grad School
Note: Assume that the given number is between 1 ~ 18
 */