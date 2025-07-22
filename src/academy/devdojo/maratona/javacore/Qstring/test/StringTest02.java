package academy.devdojo.maratona.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String name = "name";
        String numbers = "0123456789";

        System.out.println(name.charAt(2));
        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println(name.replace("n","l"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(numbers.length());
        System.out.println(numbers.substring(3,numbers.length()));
        System.out.println(name.trim());
    }
}
