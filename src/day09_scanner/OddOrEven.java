package day09_scanner;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number:");

        int num = input.nextInt();
        String result = "";

        if(num%2==0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }


        System.out.println(result);

    }
}
