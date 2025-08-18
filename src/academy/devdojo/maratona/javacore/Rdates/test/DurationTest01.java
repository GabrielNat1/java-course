package academy.devdojo.maratona.javacore.Rdates.test;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = now.plusYears(2);
        Duration d1 = Duration.between(now, nowAfterTwoYears);
        Duration d2 = Duration.ofDays(730); // 2 years in days
        Duration d3 = Duration.ofHours(48); // 2 days in hours
        Duration d4 = Duration.ofMinutes(2880); // 2 days in minutes
        System.out.println(now);
        System.out.println(nowAfterTwoYears);
        System.out.println("Duration between now and two years later: " + d1);
        System.out.println("Duration of 2 years in days: " + d2);
        System.out.println("Duration of 2 days in hours: " + d3);
        System.out.println("Duration of 2 days in minutes: " + d4);
    }
}
