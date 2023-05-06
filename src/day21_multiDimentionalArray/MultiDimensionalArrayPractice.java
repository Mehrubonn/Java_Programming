package day21_multiDimentionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDimensionalArrayPractice {
    public static void main(String[] args) {
        String [] group1 = {"Lucy", "Umran", "Sumeye", "Abdullah"};
        String [] group2 = {"Madiyar", "Khashayar", "Ravhana"};
        String [] group3 = {"Alena", "Evgeniya", "Shukur", "Hasan", "Bilal"};
        String [] group4 = {"Adelina", "Ali"};

        String [][] groups = {group1, group2, group3, group4};

        for (int i = 0; i < groups.length; i++) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));
            for (int j = 0; j < eachGroup.length; j++) {
                String eachStudent = eachGroup[j];
                System.out.println(eachStudent);
            }
        }

        System.out.println("-----------------------------------------------");
        for(String[] eachGroup : groups){
            System.out.println(Arrays.toString(eachGroup));
            for(String eachStudent : eachGroup){
                System.out.println(eachStudent);
            }
        }
        System.out.println("---------------------------------------------------------");

        for (int i = groups.length - 1; i >= 0; i--) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));
            for (String eachstudent : eachGroup) {
                System.out.println(eachstudent);
            }
        }


        System.out.println("---------------------------------------------------");

        System.out.println(groups);
        System.out.println(Arrays.toString(groups)); //toString() --> for single dimensional arrays ONLY

        System.out.println(Arrays.deepToString(groups)); // deepToString --> for multi-dimensional arrays ONLY













    }
}
