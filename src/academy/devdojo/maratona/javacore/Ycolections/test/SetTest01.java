package academy.devdojo.maratona.javacore.Ycolections.test;

import academy.devdojo.maratona.javacore.Ycolections.domain.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(1L, "manga1", 19.99));
        mangas.add(new Manga(3L, "manga2", 321.31));
        mangas.add(new Manga(7L, "manga3", 412.2));
        mangas.add(new Manga(4L, "manga4", 939.12));
        mangas.add(new Manga(9L, "manga5", 31.312));

        for(Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
