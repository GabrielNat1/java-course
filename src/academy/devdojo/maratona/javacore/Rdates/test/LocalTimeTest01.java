package academy.devdojo.maratona.javacore.Rdates.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(23, 32, 12);
        LocalTime localTimeNow = LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTimeNow);
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
        System.out.println(localTime.getNano());
    }
}
