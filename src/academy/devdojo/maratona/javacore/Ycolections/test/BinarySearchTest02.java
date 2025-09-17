package academy.devdojo.maratona.javacore.Ycolections.test;

import academy.devdojo.maratona.javacore.Ycolections.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(1L, "manga1", 19.99));
        mangas.add(new Manga(3L, "manga2", 321.31));
        mangas.add(new Manga(7L, "manga3", 412.2));
        mangas.add(new Manga(4L, "manga4", 939.12));
        mangas.add(new Manga(9L, "manga5", 31.312));

//        mangas.sort(new MangaByIdComparator());
        for (Manga manga : mangas){
            System.out.println(manga);
        }

        Manga mangaSearch = new Manga(2L, "manga6", 312.23);
        System.out.println(Collections.binarySearch(mangas, mangaSearch, mangaByIdComparator));
    }
}
