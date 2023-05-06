package day20_forEach;

import java.util.Arrays;

public class ForEachLoopPractice {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11};
        for (int each:numbers) {
            if(each%2==0){
            System.out.println(each);
            }
        }

        System.out.println("-------------------------------------------------------------------");

        int[] num = {100, 300, 210, 65, 98, 56};
        int max = num[0];
        int min = num[0];

        for (int each : num) {
            if(each>max){
                max=each;
            }
            if(each<min){
                min=each;
            }
        }

        System.out.println("max = " + max);

        System.out.println("min = " + min);

        System.out.println("------------------------------------------------");

        int[] a1 = {10, 20, 30, 40, 50};
        int[] a2 = {60, 70, 80, 90};

        int[] a3 = new int[a1.length + a2.length];
        int k = 0;
        for (int each : a1) {
            a3[k++] = each;
        }
        System.out.println(Arrays.toString(a3));

        System.out.println("---------------------------------------------------");

        String[] names = {"Mohammed Karai", "Vasyl Ko", "Gadic Fe", "Abdullah Eda"};
        for (String each : names) {
            System.out.println(each.charAt(0) + "." + each.charAt(each.lastIndexOf(" ")+1));
        }










    }
}






