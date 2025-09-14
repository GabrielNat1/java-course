package academy.devdojo.maratona.javacore.Ycolections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("manga1");
        mangas.add("manga2");
        mangas.add("manga3");
        mangas.add("manga4");
        mangas.add("manga5");

        Collections.sort(mangas);

        List<Double> moneys = new ArrayList<>();
        moneys.add(100.03);
        moneys.add(312.1);

        for (String manga : mangas){
            System.out.println(manga);
        }
    }
}
