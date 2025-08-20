package academy.devdojo.maratona.javacore.Sformatting.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataFormatterTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        String s1 = now.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = now.format(DateTimeFormatter.ISO_DATE);
        String s3 = now.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20250820", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2025-08-20", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2025-08-20", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime nowTime = LocalDateTime.now();
        String s4 = nowTime.format(DateTimeFormatter.ISO_TIME);
        System.out.println(s4);

        //LocalDateTime parse4 = LocalDateTime.parse("12:00:47.2918784", DateTimeFormatter.ISO_DATE_TIME);
        //System.out.println(parse4);
        //dd/MM/yyyy
        //MM/dd/yyyy
        //yyyy/MM/dd

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);

        LocalDateTime parseBR = LocalDate.parse("20/08/2025", formatterBR);
        System.out.println(parseBR);
    }
}
