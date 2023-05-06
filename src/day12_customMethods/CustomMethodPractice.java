package day12_customMethods;

public class CustomMethodPractice {

    public static void main(String[] args) {

        Eligible(65);
        OddEvenOrZero(0);
        GradeLevel(17);
    }

    // create a method that can check if a person is eligible to buy alcohol

    public static void Eligible (int age){
        if(age >= 21 && age < 100){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("Not eligible to buy alcohol");
        }
    }


    // create a method that can check if a number is odd, or even, or zero

    public static void OddEvenOrZero (int num){
        if(num%2==0 && num>0){
            System.out.println(num + " is even");
        }else if(num == 0){
            System.out.println(num + " is zero");
        }else{
            System.out.println(num + " is odd");
        }

    }

    // create a method that can calculate the grade of student

    public static void GradeLevel(int grade){

        int gradeLevel = 9;

        if(gradeLevel >= 1 && gradeLevel <=5){
            System.out.println("Elementary School");
        }

        if(gradeLevel >= 6 && gradeLevel <= 8){
            System.out.println("Middle School");
        }

        if(gradeLevel >= 9 && gradeLevel <= 12){
            System.out.println("High School");
        }

        if(gradeLevel >= 13 && gradeLevel <= 16){
            System.out.println("College");
        }

        if(gradeLevel >= 17 && gradeLevel <= 18){
            System.out.println("Grad School");
        }
    }
}






