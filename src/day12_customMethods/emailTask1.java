package day12_customMethods;

public class emailTask1 {
    public static void main(String[] args) {

        String email = "mike_tyson@gmail.com";

        int underscore = email.indexOf("_");
        String firstName = email.substring(0,underscore);

        String lastName = email.substring(underscore+1, email.indexOf("@"));

        String domain = email.substring(email.indexOf("@"));

        email = lastName + "_" + firstName + domain;

        System.out.println(email);

    }
}
/*
Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name
       and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email
        (Saperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com

 */