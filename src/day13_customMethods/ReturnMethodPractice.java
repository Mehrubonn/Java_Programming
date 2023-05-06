package day13_customMethods;

public class ReturnMethodPractice {
    public static void main(String[] args) {

        System.out.println( isOdd(8));
        int num = 100;
        if(isEven(num)){
            System.out.println(num + " is even number");
        }else {
            System.out.println(num + " is odd number");
        }

        System.out.println("---------------------------------------------");



    }
    public static boolean isOdd(int num){
       return (num%2 != 0)? true : false;
    }

    public static boolean isEven(int num){
        return !isOdd(num);
    }

    public static int isMax(int n1, int n2){
      //  return n1>n2 ? n1 : n2;
        if(n1>n2){
            return n1;
        }else {
            return n2;
        }
    }

    public static int isMin(int n1, int n2){
       return (n1<n2)? n1 : n2;
    }



}
/*
1. Create a method named isOdd, that can return true if a number is an odd number,
otherwise returns false


2. Create a method named isEven, that can return true if a number is an even number, otherwise returns false


3. Create a method named max, that can return the maximum number between two numbers


4. Create a method named min, that can return the minimum number
between two numbers
 */








