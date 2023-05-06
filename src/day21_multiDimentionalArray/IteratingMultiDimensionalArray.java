package day21_multiDimentionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {
        //index of elements:0   1    2     0  1   2   3  4     0    1
        int[][] arr2d =  { {10, 20, 30}, {40, 50, 60, 70, 80}, {90, 100}  };
        //index of 1D array:    0                  1               2

        for (int i = 0; i < arr2d.length; i++) {   //i: index of 1D array in arr2D
            int[] each1D = arr2d[i];
            System.out.println(Arrays.toString(each1D));
            for (int j = 0; j < each1D.length; j++){  //j: index number of elements in each 1D array
                int eachElement = each1D[j];
                System.out.println(eachElement);
            }
        }

        System.out.println("------------------------------------------------------");

        for(int[] each1DArray :arr2d){
            System.out.println(Arrays.toString(each1DArray));
            for(int eachElement : each1DArray){
                System.out.println(eachElement);
            }
        }

        System.out.println("------------------------------------------------------");

        for (int i = arr2d.length - 1; i >= 0; i--) {
            for (int j = arr2d[i].length - 1; j >= 0; j--) {
                System.out.println(arr2d[i][j]);
            }
        }

        System.out.println("------------------------------------------------------");

        for (int[] each1DArray : arr2d) {
            for (int eachElement : each1DArray) {
                System.out.println(eachElement);
            }
        }
        
        
        
        
        
        
        








    }
}
