package day16_nestedLoop;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String u, p;
        int attempts = 3;
        do{
            System.out.println("Enter your user name:");
            u = input.next();

            System.out.println("Enter your password:");
            p = input.next();

            attempts--;

            if(attempts == 0){
                break;
            }
        }while (!(u.equals("Cydeo") && p.equals("WoodenSpoon")));
    }
}




