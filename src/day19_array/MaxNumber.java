package day19_array;

public class MaxNumber {
    public static void main(String[] args) {
        int [] numbers = {100, 20, 300, 40, -29, 30};
        int max = numbers[0]; // assume that the first element is the maximum number
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i]>max){    // compares the element of the array with current maximum number
                max = numbers[i];  // replaces the current maximum number
            }
        }
        System.out.println("max = " + max);
        
        

    }
}
/*
Write a program that can find the maximum number from an array
 */
