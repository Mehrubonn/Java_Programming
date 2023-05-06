package day23_arrayList;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

   ArrayList<String> noneDup = new ArrayList<>();

        for (String each : names) {
            if(noneDup.contains(each)){
                continue;
            }
            noneDup.add(each);
        }
        System.out.println(noneDup);

        names = noneDup;
        System.out.println(names);






    }
}
