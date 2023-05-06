package day21_multiDimentionalArray;

import utilities.ArraysUtility;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int element = 6;

        int[] new_array = Arrays.copyOf(array, array.length+1);
        new_array[new_array.length-1] = element;

        System.out.println(Arrays.toString(new_array));

        System.out.println("-------------------------------------");

        int[] nums = {100,90,80,70,60};
        nums = ArraysUtility.addElement(nums, 50);
        System.out.println(Arrays.toString(nums));

        System.out.println("-------------------------------------");

        double[] n = {1.1,2.1,3.1,4.1};
        n = ArraysUtility.addElement(n, 5.1);
        n = ArraysUtility.addElement(n, 6.1);
        n = ArraysUtility.addElement(n, 7.1);
        System.out.println(Arrays.toString(n));

        System.out.println("---------------------------------------------------");

        String [] names = {"Tasnim", "Ali", "Dan"};
        names = ArraysUtility.addElement(names, "Anis");
        names = ArraysUtility.addElement(names, "Abdullah");
        System.out.println(Arrays.toString(names));

        System.out.println("----------------------------------------------------");









    }
}
