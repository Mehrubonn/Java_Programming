package day19_array;

import java.util.Arrays;

public class ArrayLiterals {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int[] nums = {10, 20, 30, 40, 50}; // Array Literal

        System.out.println(numbers.length);
        System.out.println(nums.length);

        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));

        System.out.println("====================================================");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int n =1;

        System.out.println(days[n-1]);

        System.out.println("---------------------------------------------------");

        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.println(Arrays.toString(month));

        System.out.println("--------------------------------------------------------");

        // int[] numbers2 = new int[];

        for (int i = month.length - 1; i >= 0; i--) {
            System.out.println(month[i]);
        }


























    }
}
