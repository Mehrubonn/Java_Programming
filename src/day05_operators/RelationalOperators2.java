package day05_operators;

public class RelationalOperators2 {

    public static void main(String[] args) {

        // ==:

        System.out.println(100 == 200); // false

        System.out.println("Java" == "Java"); // true

        System.out.println("Java" == "JAVA"); // false

        System.out.println("Muhtar" == "Good Guy"); // false

        System.out.println(true == false); // false

        System.out.println("---------------------------------------------");

        // !=:

        System.out.println(100 != 200); // true

        System.out.println("Java" != "Java"); // false

        System.out.println("Java" != "JAVA"); // true

        System.out.println("Muhtar" != "Good Guy"); // true

        System.out.println(true != false); // true
    }
}
