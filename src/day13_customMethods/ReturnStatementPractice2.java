package day13_customMethods;

import java.util.Scanner;

public class ReturnStatementPractice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if(number<1 || number>7){
            System.out.println("Invalid number: " + number);
            return;  // exit the main method
        }

        System.out.println( (number==1)? "Monday" :(number==2)? "Tuesday" :(number==3)? "Wednesday" :(number==4)? "Thursday"
                            :(number==5)? "Friday" :(number==6)? "Saturday" : "Sunday" );



    }



}









