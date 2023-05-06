package day19_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayObjects {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        int arr2[] = arr1;
        int arr3[] = arr2;

        arr1[0] = 100;
        arr2[2] = 300;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        System.out.println("------------------------------------------");

        String [] s1 = {"Umran", "Mehmet"};
        s1 = new String[]{"James", "Jo"};
        System.out.println(Arrays.toString(s1));

















    }
}
