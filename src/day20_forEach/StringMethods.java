package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Cydeo School";
        char[] ch = str.replace(" ", "").toCharArray();
        System.out.println(Arrays.toString(ch));

        System.out.println("------------------------------------");

        String str2 = "Today is a great day to learn java";

        String words[] = str2.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println("------------------------------------------------");
        String sentence = "Today is a great day";
        String[] str3 = sentence.split(" ");

        String[] str4 = ArraysUtility.reverse(str3);
        System.out.println(Arrays.toString(str4));

        String reversed = "";
        for (int i = 0; i < str4.length; i++) {
            reversed += str4[i] + " ";
        }








    }

}
