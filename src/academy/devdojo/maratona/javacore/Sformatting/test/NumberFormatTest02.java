package academy.devdojo.maratona.javacore.Sformatting.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = new Locale("ja", "JP");
        Locale localeUS = new Locale("en", "US");
        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[2] = NumberFormat.getCurrencyInstance(localeUS);
        nfa[3] = NumberFormat.getCurrencyInstance(localePT);
        double value = 12000_345_067.89421;

        for (NumberFormat numberFormat : nfa) {
            //System.out.println(numberFormat.getMaximumFractionDigits());
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(value));
        }

        String valueString = "12000_345_067.89421";
        try {
            System.out.println(nfa[0].parse(valueString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
