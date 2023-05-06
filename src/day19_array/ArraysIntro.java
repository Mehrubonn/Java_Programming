package day19_array;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        int score1 = 85;
        int score2 = 75;
        int score3 = 64;
        int score4 = 95;
        int score5 = 57;

        System.out.println("---------------------------------");

        int[] scores = new int[5];
        scores[2] = 78;
        scores[0] = 87;
        scores [1] = 90;
        scores [3] = 65;
        scores [4] = 97;

        //scores[5] = 88;

       // scores = new int[10]; //index: 0-9
        // scores = new int[50]; //index: 0-49

        System.out.println(Arrays.toString(scores));

        System.out.println(scores[2]);

        System.out.println("--------------------------------------------");

        for (int i = 0; i < scores.length; i++) { //i: index number of scores array
            System.out.println(scores[i]);
        }

        System.out.println("--------------------------------------------");

        System.out.println(scores[scores.length-1]);

        System.out.println("-----------------------------------------------");










    }









}
