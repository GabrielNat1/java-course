package academy.devdojo.maratona.javacore.Ycolections.test;

import academy.devdojo.maratona.javacore.Ycolections.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga o1, Manga o2) {
        return o1.getId().compareTo(o2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(1L, "manga1", 19.99));
        mangas.add(new Manga(3L, "manga2", 321.31));
        mangas.add(new Manga(7L, "manga3", 412.2));
        mangas.add(new Manga(4L, "manga4", 939.12));
        mangas.add(new Manga(9L, "manga5", 31.312));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas);
        System.out.println("-------------------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

//        Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator());
        System.out.println("-------------------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
