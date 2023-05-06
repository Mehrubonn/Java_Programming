package day09_scanner;

import java.util.Scanner;

public class Eligible {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");

        int age = input.nextInt();
        String result = "";
        
        if(age>=21 && age<100){
            result = "You are eligible";
        } else {
            result = "You are not eligible";
        }

        System.out.println(result);
    }
}
