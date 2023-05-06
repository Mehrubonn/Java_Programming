package day14_forLoop;

public class MethodOverloadingPractice {

    public static void main(String[] args) {

        System.out.println(sum(10, 20));

        System.out.println(sum(10, 20, 30));

        System.out.println(sum(10, 20, 20, 40));

        System.out.println(sum(1.5, 4.5));

        System.out.println(sum(3.5, 5.6, 5.6, 7.5));
    }

    public static int sum(int n1, int n2){
        return n1 + n2;
    }

    public static int sum(int n1, int n2, int n3){
        //return n1 + n2 + n3;
        return sum(n1, n2) + n3;
    }

    public static int sum(int n1, int n2, int n3, int n4){
        // return n1 + n2 + n3 + n4;
        return sum(n1, n2, n3) + n4;
    }

    public static double sum(double num1, double num2){
        return  num1 + num2;
    }

    public static double sum(double num1, double num2, double num3){
        return sum(num1, num2) + num3;
    }

    public static double sum(double num1, double num2, double num3, double num4){
        return sum(num1, num2, num3) + num4;
    }

}














