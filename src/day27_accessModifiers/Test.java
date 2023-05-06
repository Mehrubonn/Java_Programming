package day27_accessModifiers;

public class Test {
    public static void main(String[] args) {

        System.out.println(StaticInitializationBlock.a);
        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.c);

        System.out.println("---------------------------------------------------------");

        System.out.println(AccessModifiers.publicDate); // public is accessible within the same package

        System.out.println(AccessModifiers.protectedData); // protected is accessible within the same package

        System.out.println(AccessModifiers.defaultData); // protected is accessible within the same package

        // System.out.println(AccessModifiers.privateData); // private is NOT accessible within the same package

        new AccessModifiers();

        AccessModifiers.publicMethod();
        AccessModifiers.protectedMethod();
        AccessModifiers.defaultMethod();
        //AccessModifiers.privateMethod();













    }
}
