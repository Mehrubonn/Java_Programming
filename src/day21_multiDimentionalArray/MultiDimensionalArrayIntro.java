package day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50, 60, 70, 80};
        int[] arr3 = {90, 100};

        System.out.println("-------------------------------------------------");

        int[][] arr2d =  { {10, 20, 30}, {40, 50, 60, 70, 80}, {90, 100}  };  //index: 0~2
        //index:                0                 1                2
        System.out.println(arr2d.length);

        System.out.println(Arrays.toString(arr2d[1]));
        System.out.println(Arrays.toString(arr2d[2]));
        System.out.println(Arrays.toString(arr2d[0]));

        System.out.println(arr2d[2][0]);
        System.out.println(arr2d[1][2]);










    }
}
