package academy.devdojo.maratona.javacore.Rdates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        if (c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("the first day of the week is Sunday");
        }

        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        c.add(Calendar.DAY_OF_MONTH, 1); // add 1 day
        c.roll(Calendar.HOUR, 1); // add 1 hour

        Date date = c.getTime();
        System.out.println(date);
    }
}
