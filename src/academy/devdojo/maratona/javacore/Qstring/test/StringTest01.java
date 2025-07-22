package academy.devdojo.maratona.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        // String constant pool
        String name = "name";
        String name2 = "name";
        name = name.concat(" Silva");
        System.out.println(name);
        System.out.println(name == name2);

        String name3 = new String("name"); // 1. variable reference, 2. object String, 3. String pool
        System.out.println(name2 == name3);
        System.out.println(name2 == name3.intern());
    }
}
