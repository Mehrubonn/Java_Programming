package day27_accessModifiers;

import javax.swing.*;

public class AccessModifiers {
    public static int publicDate = 200;

    protected static int protectedData = 300;

    static int defaultData = 400;

    static int privateData = 500;

    public AccessModifiers(){

    }

    public static void publicMethod(){
        System.out.println("Public");
    }

    protected static void protectedMethod(){
        System.out.println("Protected");
    }

     static void defaultMethod(){
        System.out.println("Default");
    }

    private static void privateMethod(){
        System.out.println("Private ");
    }



    public static void main(String[] args) {

        System.out.println(publicDate); // public is accessible within the same class
        System.out.println(protectedData); // protected is accessible within the same class
        System.out.println(defaultData); // default is accessible within the same class
        System.out.println(privateData); // private is accessible within the same class
    }
}









