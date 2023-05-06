package day16_nestedLoop;

import java.util.Scanner;

public class CydeoLogin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username:");
        String u = input.next();
        System.out.println("Enter your password:");
        String p = input.next();

        if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
            System.out.println("Logged in");
        } else {
            for (int i = 0; i < 3; i++) {
                if (i != 2) {
                    System.err.println("Incorrect username or password, please re-enter");
                    //}else {
                    //  System.out.println("This is your last attempt. Please re-enter");
                    //}
                    System.out.println("Enter your username:");
                    u = input.next();

                    System.out.println("Enter your password:");
                    p = input.next();

                    if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
                        System.out.println("You are now logged in");
                        break;
                    }
                }
                if (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))) {
                    System.err.println("Your account is locked. Please contact the support team.");
                }
            }
            input.close();
        }
        }

        public static void CydeoLogin(String username, String password){
        if(username.equals("Cydeo") && password.equals("WoodenSpoon")){
            System.out.println("Logged in");
        }else{
            System.out.println("Invalid credentials");
        }
        }

    }


/*
1. Create a class named CydeoLogIn. you are writing a code for the log-in function
of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."

                If the credentials are not matched, the program should allow
                the user to have three attempts to enter correct credentials

                if all three attempts are failed, then print "Your account is lucked."


 */
