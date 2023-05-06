package day24_dateAndTime;
import java.time.LocalDate;
import java.util.Arrays;

public class LocalDateIntro {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate birthDate = LocalDate.of(1997, 05, 06);
        System.out.println(birthDate);
        System.out.println("--------------------------------------------------");
        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getMonthValue());
        System.out.println(today.getDayOfWeek());
        System.out.println(birthDate.getDayOfWeek());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfYear());

        System.out.println("-----------------------------------------------------");
        today = today.plusYears(1);
        System.out.println(today);

        System.out.println("-------------------------------------------------------");

        LocalDate graduationDate = LocalDate.of(2023, 8, 14);
        graduationDate = graduationDate.plusYears(2);
        System.out.println(graduationDate);

        graduationDate = graduationDate.plusMonths(7);
        System.out.println(graduationDate);

        graduationDate = graduationDate.plusWeeks(4);
        System.out.println(graduationDate);

        graduationDate.plusDays(120);
        System.out.println(graduationDate);

        System.out.println("----------------------------------------------------");

        LocalDate yourBDay = LocalDate.of(1997, 05, 06);
        LocalDate yourBrotherBDay = yourBDay.minusYears(2).minusMonths(3);
        System.out.println(yourBDay);
        System.out.println(yourBrotherBDay);

        System.out.println("-----------------------------------------------------------");

        LocalDate bD1 = LocalDate.of(1994, 7, 7);
        LocalDate bD2 = LocalDate.of(1995, 6, 7);

        boolean r1 = bD1.isEqual(bD2);
        System.out.println(r1);

        System.out.println("---------------------------------------------------------");

        LocalDate grad_date = LocalDate.of(2023, 8, 11);
        System.out.println(grad_date.isBefore(LocalDate.of(2022, 7, 20)));
        System.out.println(grad_date.isAfter(LocalDate.of(2022, 7,7)));

        System.out.println("------------------------------------------------------");

        System.out.println(LocalDate.of(2023, 4, 3).isLeapYear());
















    }
}
