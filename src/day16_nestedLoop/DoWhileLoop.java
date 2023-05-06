package day16_nestedLoop;

public class DoWhileLoop {
    public static void main(String[] args) {

        boolean condition = false;

        for (int i = 0; condition; ){
            System.out.println("Hello Cydeo -- For loop");
        }

        System.out.println("--------------------------------------------");

        while (condition){
            System.out.println("Hello Cydeo -- While loop");
        }

        System.out.println("------------------------------------------");

        do{
            System.out.println("Hello Cydeo -- DoWhile loop");
        }while (condition);


    }
}
