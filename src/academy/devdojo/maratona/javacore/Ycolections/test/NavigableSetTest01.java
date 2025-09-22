package academy.devdojo.maratona.javacore.Ycolections.test;

import academy.devdojo.maratona.javacore.Ycolections.domain.Manga;
import academy.devdojo.maratona.javacore.Ycolections.domain.SmartPhone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartPhoneBrandComparator implements Comparator<SmartPhone> {
    @Override
    public int compare(SmartPhone o1, SmartPhone o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}

class MangaPriceComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
//        NavigableSet<Manga> set = new TreeSet<>(new MangaPriceComparator());
//        SmartPhone s1 = new SmartPhone("231", "nokia");
//        set.add(s1);
//        System.out.println(set);

        System.out.println("----------------------------");

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPriceComparator());
        mangas.add(new Manga(1L, "B manga1", 19.99));
        mangas.add(new Manga(3L, "T manga2", 321.31));
        mangas.add(new Manga(7L, "D manga3", 412.2));
        mangas.add(new Manga(4L, "J manga4", 939.12));
        mangas.add(new Manga(9L, "R manga5", 31.312));
        mangas.add(new Manga(10L, "A manga5", 31.312));

        for(Manga manga : mangas){
            System.out.println(manga);
        }

        // lower <
        // floor <=
        // higher >
        // ceiling >=
        // poolFirst return first element and remove
        // poolLast return last element and remove
    }
}
