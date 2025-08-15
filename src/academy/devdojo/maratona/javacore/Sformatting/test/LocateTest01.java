package academy.devdojo.maratona.javacore.Sformatting.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocateTest01 {
    public static void main(String[] args) {
        // pt - BR
        Locale localeItaly = new Locale("it", "IT");
        Locale localeBrazil = new Locale("pt", "BR");
        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeBrazil);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);

        System.out.println("Brazil: " + df1.format(calendar.getTime()));
        System.out.println("Italia: " + df2.format(calendar.getTime()));
    }
}
