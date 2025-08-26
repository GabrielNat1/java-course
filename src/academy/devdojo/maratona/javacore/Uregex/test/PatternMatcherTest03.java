package academy.devdojo.maratona.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = All digits
        // \D = Everything that is not a digit
        // \s = Whitespace characters \t \n \f \r
        // \S = All characters except whitespace
        // \w = a–z, A–Z, digits, _
        // \W = Everything not included in \w
        // []

        //String regex = "[a-zA-C]";
        String regex = "0[xX][0-9a-fA-F]";
        String text = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("text: " +matcher);
        System.out.println("index: 0123456789");
        System.out.println("regex: " +regex);
        System.out.println("pos find");

        while(matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group() + "\n");
        }

        //int numberHex = 0X59F86A;
        //System.out.println(numberHex);
    }
}
