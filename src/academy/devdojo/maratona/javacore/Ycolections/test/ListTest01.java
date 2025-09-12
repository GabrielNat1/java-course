package academy.devdojo.maratona.javacore.Ycolections.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(16);
        names.add("person 1");
        names.add("person 2");
        names.add(String.valueOf(121212));

        for (String name : names){
            System.out.println(name);
        }

        System.out.println("--------------------");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

    }
}
