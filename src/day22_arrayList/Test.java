package day22_arrayList;

import utilities.ArraysUtility;

public class Test {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,50,60};
        boolean has20 = ArraysUtility.contains(arr, 20);
        System.out.println(has20);

        System.out.println("---------------------------------------");

        String[] students = {"Sumaye", "Hamza", "Marika"};
        System.out.println(ArraysUtility.contains(students,"Hamza"));









    }
}
