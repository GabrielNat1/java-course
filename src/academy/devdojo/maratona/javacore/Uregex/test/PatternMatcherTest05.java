package academy.devdojo.maratona.javacore.Uregex.test;

import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // \d = All digits
        // \D = Everything that is not a digit
        // \s = Whitespace characters \t \n \f \r
        // \S = All characters except whitespace
        // \w = a–z, A–Z, digits, _
        // \W = Everything not included in \w
        // []
        // ? Zero or one
        // * Zero or more
        // + One or more
        // {n,m} n a m
        // ( ) Agrouping character
        // | or
        // $ End of line
        // . Any character

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String text = "luff@hotmail.com, 123jotaro@gmail.com, #@!zoro@gmail.br, teste@gmail.com, sakura@gmail.com";
        System.out.println(" " + "#@!zoro@gmail.br".matches(regex));
        System.out.println(text.split(", ")[1].trim());
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
