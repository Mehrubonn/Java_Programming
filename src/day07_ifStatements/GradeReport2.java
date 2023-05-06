package day07_ifStatements;

public class GradeReport2 {
    public static void main(String[] args) {

        int score = 120; // 0 - 100

        String result = "Your grade is: ";

        if(score >=0 && score <= 100) {

            if(score >= 90) { // false: score < 90
                result += 'A';
            }else if(score >= 80 && score < 90) { // false: score < 80
                result += 'B';
            }else if(score >= 70 && score < 80) { // false: score < 70
                result += 'C';
            }else if(score >= 60 && score < 70) {
                result += 'D';
            }else if (score < 60) {
                result += 'F';
            }
        }else {
            System.out.println("Invalid");
        }

    }
}


/*
1. Create a class named GradeReport.java
2. An integer variable named score is declared and given, Write a
program that can print the grade of the student
Ex:
score = 95
output:
Your grade is A
Note: Assume that the given score is between 0 ~ 100
 */