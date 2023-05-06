package day25_constructors;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatPractice {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, h:mm a, MMM/dd/y");
        LocalDateTime date1 = LocalDateTime.of(2023, 11, 23, 3, 6);
        System.out.println(date1.format(dtf));
    }
}
/*
1. use the LocalDateTime get the date and time in the following format:
            Tuesday, 1:00 pm, Nov/24/2020
 */
