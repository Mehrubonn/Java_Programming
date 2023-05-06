package day12_customMethods;

public class CustomMethodsWithParameter {
    public static void main(String[] args) {

        oddOrEven(8);

        System.out.println("------------------------------------");

        System.out.println(100000);


        int num1 = 100;
        oddOrEven(num1);

        int num2 = 35;
        oddOrEven(num2);

        int num3 = 79;
        oddOrEven(num3);

        int num4 = 49;
        oddOrEven(num4);


    }

    // the method takes argument number, and verifies if the number is odd number or even number
    public static void oddOrEven(int number){

        if(number%2==0){
            System.out.println(number + " is even number");
        }else {
            System.out.println(number + " is odd number");
        }

    }

}






