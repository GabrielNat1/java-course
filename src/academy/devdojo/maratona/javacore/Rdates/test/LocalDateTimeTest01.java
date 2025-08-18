package academy.devdojo.maratona.javacore.Rdates.test;

import java.time.LocalDateTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2025, 1, 27, 23, 32, 12);
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTimeNow);
    }
}
