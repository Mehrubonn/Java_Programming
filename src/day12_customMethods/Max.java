package day12_customMethods;

public class Max {
    public static void main(String[] args) {
        maxNumber(10.5,50.6);

        System.out.println("-----------------------------------");

        maxNumber(76, 98);
    }

    // create a method that can print the maximum number between two numbers, if both are equal then print "Equal", (num1, num2)
    public static void maxNumber (double num1, double num2){
        if(num1>num2){
            System.out.println(num1 + " is the maximum number");
        } else if (num2>num1) {
            System.out.println(num2 + " is the maximum number");
        }else{
            System.out.println("Equal");
        }


    }






}
