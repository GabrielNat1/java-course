package academy.devdojo.maratona.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String name = "name";
        name.concat(" DevDojo Academy");
        name.substring(0, 3);
        System.out.println(name);

        StringBuilder sb = new StringBuilder("name");
        sb.append(" teste").append(" teste2");
        sb.reverse();
        sb.reverse();
        sb.delete(0, 2);
        System.out.println(sb);
    }
}
