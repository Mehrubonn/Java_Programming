package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list1.addAll(1, numbers);
        System.out.println(list1);

        System.out.println("---------------------------------------------------");

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(75,85,95,90));

        System.out.println("--------------------------------------------");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Gadir","Hasan","Abdullah","Bilal"));
        System.out.println(students);

        students.addAll(2, Arrays.asList("Shukur", "Sumeye", "Tatiana"));
        System.out.println(students);
        System.out.println("--------------------------------------------------");

        Integer[] nums = {1,2,3,4,5,6,7,8};
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(nums));
    //    l1.addAll(Arrays.asList(nums));
        System.out.println(l1);

        System.out.println("-------------------------------------------------------");

        ArrayList <String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Alena","Muhtar","Gadir","Ali"));
        System.out.println(employees);
        boolean hasAlena = employees.contains("Alena");

        System.out.println("hasAlena = " + hasAlena);
        boolean hasAlenaAndGadir = employees.containsAll(Arrays.asList("Alena","Gadir"));
        System.out.println("hasAlenaAndGadir = " + hasAlenaAndGadir);
        boolean hasAlenaAndGadirandCuzzat = employees.containsAll(Arrays.asList("Cuzzat","Alena","Gadir"));
        System.out.println("hasAlenaAndGadirandCuzzat = " + hasAlenaAndGadirandCuzzat);

        System.out.println("---------------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,10,10,20,30,40,50,60,80,10,10,10,10,20,20,20,20,10,90));
        list.removeAll(Arrays.asList(10,20));
        System.out.println("list = " + list);

        System.out.println("------------------------------------------------------------");
        ArrayList<String> developers = new ArrayList<>();
        developers.addAll(Arrays.asList("Alena","Muhtar","Gadir","Ali","Sumeye","Muhtar"));
        developers.retainAll(Arrays.asList("Alena","Gadir","Muhtar"));
        System.out.println(developers);

        System.out.println("--------------------------------------------------------");
        ArrayList<String>grocerList = new ArrayList<>();
        grocerList.addAll(Arrays.asList("Eggs","Potato","Rice","Strawberry","Orange"));
        grocerList.retainAll(Arrays.asList("Eggs","Rice"));
        System.out.println(grocerList);



















    }
}
