package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,9,10,12));
        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("----------------------------------------------------");

        ArrayList<String> items = new ArrayList<>();
        items.addAll(Arrays.asList("Eggs","Potato","Rice","Strawberry","Orange"));

        Collections.sort(items);

        System.out.println(items);

        System.out.println("---------------------------------------------------------");

        Collections.reverse(items);
        System.out.println(items);

        System.out.println("---------------------------------------------------");

        ArrayList<String> developers = new ArrayList<>();
        developers.addAll(Arrays.asList("Alena","Muhtar","Gadir","Ali","Sumeye","Muhtar"));
        System.out.println(developers);

        Collections.swap(developers, 1, 0);
        System.out.println(developers);

        Collections.swap(developers, 0, developers.size()-1);
        System.out.println(developers);




    }
}
