package academy.devdojo.maratona.javacore.Ycolections.test;

import academy.devdojo.maratona.javacore.Ycolections.domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(1L, "manga1", 19.99, 5));
        mangas.add(new Manga(3L, "manga2", 321.31, 3));
        mangas.add(new Manga(7L, "manga3", 412.2, 0));
        mangas.add(new Manga(4L, "manga4", 939.12, 2));
        mangas.add(new Manga(9L, "manga5", 31.312, 0));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while(mangaIterator.hasNext()){
//            if (mangaIterator.next().getAmount() == 0){
//                mangaIterator.remove();
//            }
//        }

        mangas.removeIf(manga -> manga.getAmount() ==0);
        System.out.println(mangas);
    }
}
