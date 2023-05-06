package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {
    public static void main(String[] args) {
        Person[] people = {new Person(), new Person(), new Person(), new Person(), new Person()};
        people[0].setInfo("Daniel", 'M', LocalDate.of(1988, 2,3));
        people[1].setInfo("Margarett", 'F', LocalDate.of(1990,4,4));
        people[2].setInfo("Odil", 'M', LocalDate.of(1970,5,2));
        people[3].setInfo("Yavuz", 'M', LocalDate.of(1987, 6, 12));
        people[4].setInfo("Aizat", 'F', LocalDate.of(1978,5,5));

        ArrayList<Person> studentsList = new ArrayList<>();
        studentsList.addAll(Arrays.asList(people));

        studentsList.removeIf(p->p.age>35);
        System.out.println(studentsList);






    }
}




