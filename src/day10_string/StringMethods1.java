package day10_string;

import java.util.Scanner;

public class StringMethods1 {
    public static void main(String[] args) {
        String str = "Cydeo";
        // index:     01234
        
        char firstChar = str.charAt(0);
        char secondChar = str.charAt(1);
        char thirdChar = str.charAt(2);
        char fourthChar = str.charAt(3);
        char fifthChar = str.charAt(4);

        // char nthChar = str.charAt(25);

        System.out.println("firstChar = " + firstChar);
        System.out.println("secondChar = " + secondChar);
        System.out.println("thirdChar = " + thirdChar);
        System.out.println("fourthChar = " + fourthChar);
        System.out.println("fifthChar = " + fifthChar);

        // System.out.println(nthChar);

        System.out.println("---------------------------------------------");

        String sentence = "Java Programming Language";

        int length = sentence.length();

        System.out.println(length);

        int lastIndex = length - 1;

        System.out.println(lastIndex);

        System.out.println("--------------------------------------");

        String s1 = "Java is the best programming language";

        char f = s1.charAt(0);

        int lastIndexNumber = s1.length() - 1;

        char l = s1.charAt(lastIndexNumber);

        System.out.println(f + " : " + l);

        System.out.println("----------------------------------------");

        String num1 = "Umran";
        String num2 = new String("Umran");

        System.out.println(num1 == num2);
        System.out.println(num1.equals(num2));

        System.out.println("-----------------------------------------");

        String r1 = "Java";
        String r2 = "Java";
        String r3 = "Java";

        System.out.println(r1 == r2); // true
        System.out.println(r1 == r3); // false
        System.out.println(r2 == r3); // false

        System.out.println(r1.equals(r3)); // true
        System.out.println(r2.equals(r3)); // true

        System.out.println("-----------------------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("How old are you?");

        int age = input.nextInt();

        System.out.println("Are you a US citizen?");
        String answer = input.next();

        if(age >= 21 && answer.equals("yes")){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not eligible to vote");
        }

        input.close();






    }
}
