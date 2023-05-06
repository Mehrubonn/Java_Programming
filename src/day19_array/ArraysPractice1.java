package day19_array;

import java.util.Arrays;

public class ArraysPractice1 {
    public static void main(String[] args) {

        String myGroup[] = new String[5];
        myGroup[0] = "Margarett";
        myGroup[myGroup.length-1] = "Osil";
        myGroup[2] = "Sumeye";
        myGroup[1] = "Abdullah";
        myGroup[3] = "Khasayar";

        System.out.println(Arrays.toString(myGroup));

        myGroup[1] = "Osim";
        myGroup[4] = "Muhtar";

        System.out.println(Arrays.toString(myGroup));

        System.out.println("------------------------------");

        for (int i = myGroup.length-1; i >= 0 ; i--) {
            System.out.println(myGroup[i]);
        }

        System.out.println("------------------------------------------");


















    }
}
