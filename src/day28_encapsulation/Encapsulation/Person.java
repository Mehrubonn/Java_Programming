package day28_encapsulation.Encapsulation;


import java.time.LocalDate;

public class Person {
    private String name;
    private int age;
    private char gender;
    private LocalDate dateOfBirth;


    public Person(String name, int age, char gender, LocalDate dateOfBirth) {
        setName(name);
        setAge(age);
        setGender(gender);
        setDateOfBirth(dateOfBirth);
    }

    public String getName() {
        if(name==null){
            System.err.println("Unknown");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty() || name.isBlank()){
            System.err.println("Name can not be null/empty/blank");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        if(age==0){
            System.err.println("Unknown");
            System.exit(1);
        }
        return age;
    }

    public void setAge(int age) {
        if(age<0 || age>120){
            System.err.println("Age can not be less than 0 or greater than 120");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        if(gender==0){
            System.err.println("Unknown");
            System.exit(1);
        }
        return gender;
    }

    public void setGender(char gender) {
        if(gender!='M' || gender!='F'){
            System.err.println("Gender can only be 'M' or 'F'");
            System.exit(1);
        }
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        if(dateOfBirth.isAfter(LocalDate.now())){
            System.err.println("Can not be after today`s date");
            System.exit(1);
        }
        this.dateOfBirth = dateOfBirth;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", dateOfBirth=" + getDateOfBirth() +
                '}';
    }
}







