package academy.devdojo.maratona.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "ab";
        String text = "abaabaa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("text: " +matcher);
        System.out.println("index: 0123456789");
        System.out.println("regex: " +regex);
        System.out.println("pos find");

        while(matcher.find()){
            System.out.println(matcher.start() + " ");
        }

    }
}
