package academy.devdojo.maratona.javacore.Rdates.test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime birthDate = LocalDateTime.of(2025, 1, 27, 23, 32, 12);
        System.out.println(ChronoUnit.DAYS.between(birthDate, LocalDateTime.now()));
        System.out.println(ChronoUnit.WEEKS.between(birthDate, LocalDateTime.now()));
        System.out.println(ChronoUnit.MONTHS.between(birthDate, LocalDateTime.now()));
        System.out.println(ChronoUnit.YEARS.between(birthDate, LocalDateTime.now()));

    }
}
