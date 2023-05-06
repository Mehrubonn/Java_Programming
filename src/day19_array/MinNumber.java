package day19_array;

public class MinNumber {
    public static void main(String[] args) {
        int [] numbers = {100, 20, 300, 40, -29, 30};
        int min = numbers[0]; // assume that the first element is the minimum number
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i]<min){    // compares the element of the array with current minimum number
                min = numbers[i];  // replaces the current minimum number
            }
        }
        System.out.println("min = " + min);

    }
}
/*
  Write a program that can find the minimum number from an array
 */







