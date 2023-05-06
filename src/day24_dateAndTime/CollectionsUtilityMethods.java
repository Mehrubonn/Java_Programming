package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMethods {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Java"));
        System.out.println(names);
/*
        for (int i = 0; i < names.size(); i++) {
            if(names.get(i).equals("Java")){
                names.set(i, "Python");
            }
        }

 */
        Collections.replaceAll(names, "Java", "Python");
        System.out.println(names);


        System.out.println("------------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,20,30,30,40,40,50,50,50,50,60,60,70,50,50));
        int count = Collections.frequency(list, 50);
        System.out.println(count);

        System.out.println("-------------------------------------------------------");

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Java"));

        int count1 = Collections.frequency(words, "Java");
        System.out.println(count1);

        System.out.println("------------------------------------------------------");
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(10,20,20,30,30,40,40,50,50,50,50,60,60,70,50,50));

        for (Integer each : nums) {
            if(Collections.frequency(nums, each) == 1){
                System.out.println(each);
            }
        }







    }
}



