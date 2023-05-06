package day23_arrayList;

import java.util.ArrayList;

public class AverageNum {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int sum = 0;
        for (Integer each : list) {
            sum += each;
        }

        double average = sum / (double)list.size();
        System.out.println("average = " + average);





        
    }
}
/*
Write a program that can find the average number from an arrayList of integers
 */
