package day27_accessModifiers;

public class StaticBlock {

    static {
        System.out.println("Constructor");
    }
    public static void main(String[] args) {
        System.out.println("Main Method");

        new StaticBlock();
        new StaticBlock();
        new StaticBlock();
    }

    static {
        System.out.println("Static Block");
    }
}



