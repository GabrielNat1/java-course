package academy.devdojo.maratona.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfter10Days = now.plusDays(10);
        Period p1 = Period.between(now, nowAfter10Days);
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofWeeks(1);
        System.out.println("Period between now and 10 days later: " + p1);
        System.out.println("Period of 10 days: " + p2);
        System.out.println("Period of 1 week: " + p3);
        System.out.println(now.until(now.plusDays(p3.getDays()), ChronoUnit.DAYS));
    }
}
