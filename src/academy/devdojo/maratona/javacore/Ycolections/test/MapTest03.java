package academy.devdojo.maratona.javacore.Ycolections.test;

import academy.devdojo.maratona.javacore.Ycolections.domain.Consumer;
import academy.devdojo.maratona.javacore.Ycolections.domain.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumer consumer1 = new Consumer("consumer 01");
        Consumer consumer2 = new Consumer("consumer 02");

        Manga manga1 = new Manga(1L, "berserk", 19.99);
        Manga manga2 =new Manga(3L, "pokemon", 321.31);
        Manga manga3 =new Manga(7L, "dragon ball", 412.2);
        Manga manga4 =new Manga(4L, "dragon ball 1", 939.12);
        Manga manga5 =new Manga(9L, "dragon ball 2", 31.312);

        List<Manga> mangaConsumer1List = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumer2List = List.of(manga4, manga2);

        Map<Consumer, List<Manga>> consumerMangaMap = new HashMap<>();
        consumerMangaMap.put(consumer1, mangaConsumer1List);
        consumerMangaMap.put(consumer2, mangaConsumer2List);

        for (Map.Entry<Consumer, List<Manga>> entry : consumerMangaMap.entrySet()){
            System.out.println("--------- " + entry.getKey().getName());
            for (Manga manga : entry.getValue()) {
                System.out.println("------------ " + manga.getName());
            }
        }
    }
}
