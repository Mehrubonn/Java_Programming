package day22_arrayList;
import java.util.ArrayList;
public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); //0
        list.add(20); //1
        list.add(30); //2
        list.add(10); //3
        //list.add(5.5);
        System.out.println(list);
        list.add(2,34);
        System.out.println(list);
        list.add(1,10);
        System.out.println(list);

        System.out.println("----------------------------------------------------");
        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("Abdurasul");
        studentList.add("Muhammad");
        studentList.add("Abdullah");
        studentList.add("Tatiana");

        System.out.println(studentList.size());
        System.out.println(studentList.get(0));
        System.out.println(studentList.get(studentList.size()-1));
















    }
}




