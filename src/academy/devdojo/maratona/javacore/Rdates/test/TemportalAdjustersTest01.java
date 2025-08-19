package academy.devdojo.maratona.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class TemportalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.with(ChronoField.DAY_OF_MONTH, 20);
        System.out.println(now);
        System.out.println(now.getDayOfMonth());
    }
}
