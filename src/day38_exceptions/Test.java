package day38_exceptions;

import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello Cydeo");
       // Thread.sleep(3500);

        System.out.println("How are you today?");
        System.out.println("--------------------------------------------------------");

        if(LocalTime.now().equals(LocalTime.of(4, 34))){
            throw new BreakTimeException();
        }

       // throw new RuntimeException("Something went wrong");
        throw new BreakTimeException("It`s time to go home");

      //  throw new BreakTimeException();
        }
    }


