package academy.devdojo.maratona.javacore.Rformatting.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = new Locale("ja", "JP");
        Locale localeUS = new Locale("en", "US");
        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeJP);
        nfa[2] = NumberFormat.getInstance(localeUS);
        nfa[3] = NumberFormat.getInstance(localePT);
        double value = 12000_345_067.89421;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(value));
        }

    }
}
