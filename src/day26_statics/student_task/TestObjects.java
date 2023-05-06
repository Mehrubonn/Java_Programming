package day26_statics.student_task;

public class TestObjects {
    public static void main(String[] args) {
        Student student1 = new Student("Yusuf", 21, 'M', "E16");
        Student student2 = new Student("Glenio", 24, 'M', "A34");
        Student student3 = new Student("Sumeye", 22, 'F', "V56");
        Student student4 = new Student("Mehmet", 23, 'M', "B43");
        Student student5 = new Student("Sabastian", 23, 'M', "C27");

        Student[] students = {student2, student3, student4, student5};
        StudentsGroup group1 = new StudentsGroup("Java Turtles", 1);
        group1.addStudent(student1);

        group1.addStudent(students);

        group1.addStudent("Khashayar", 34, 'M', "F34");

        group1.removeStudent("V56");
        group1.removeStudent("B43");
        System.out.println(group1);

        for (Student each : group1.students) {
            System.out.println(each.name + ": " + each.id);
        }


        StudentsGroup group2 = new StudentsGroup("Java Turtles", 1);

        StudentsGroup group3 = new StudentsGroup("Java Turtles", 1);

        StudentsGroup group4 = new StudentsGroup("Java Turtles", 1);


        StudentsGroup[] groups = {group1, group2, group3, group4};









    }
}
/*
3. Create a class named TestObjects
	            3.1 Create 5 Student objects
	            3.2 Create a StudentGroup object
	            3.3 Add all the student objets to the StudentsGroup object' students list

 */