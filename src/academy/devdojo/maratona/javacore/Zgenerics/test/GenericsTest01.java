package academy.devdojo.maratona.javacore.Zgenerics.test;

import academy.devdojo.maratona.javacore.Ycolections.domain.Consumer;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(6);
        list.add("Midoriya");
        list.add("Midoriya");


        for (String o : list) {
            System.out.println(o);
        }
        add(list, new Consumer("Midoriya"));

        for (Object o : list) {
            System.out.println(o);
        }

    }

    private static void add(List list, Consumer consumer) {
        list.add(consumer);
    }
}
