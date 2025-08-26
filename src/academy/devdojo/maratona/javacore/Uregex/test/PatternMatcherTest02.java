package academy.devdojo.maratona.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = All digits
        // \D = Everything that is not a digit
        // \s = Whitespace characters \t \n \f \r
        // \S = All characters except whitespace
        // \w = a–z, A–Z, digits, _
        // \W = Everything not included in \w

        String regex = "\\d";
        String text = "hh311412412fa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("text: " +matcher);
        System.out.println("index: 0123456789");
        System.out.println("regex: " +regex);
        System.out.println("pos find");

        while(matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group() + "\n");
        }

    }
}
