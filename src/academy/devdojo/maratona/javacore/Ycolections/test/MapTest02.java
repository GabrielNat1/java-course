package academy.devdojo.maratona.javacore.Ycolections.test;

import academy.devdojo.maratona.javacore.Ycolections.domain.Consumer;
import academy.devdojo.maratona.javacore.Ycolections.domain.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumer consumer1 = new Consumer("consumer 01");
        Consumer consumer2 = new Consumer("consumer 02");

        Manga manga1 = new Manga(1L, "manga1", 19.99);
        Manga manga2 =new Manga(3L, "manga2", 321.31);
        Manga manga3 =new Manga(7L, "manga3", 412.2);
        Manga manga4 =new Manga(4L, "manga4", 939.12);
        Manga manga5 =new Manga(9L, "manga5", 31.312);

        Map<Consumer, Manga> consumerMangaMap = new HashMap<>();
        consumerMangaMap.put(consumer1, manga1);
        consumerMangaMap.put(consumer2, manga5);

        for(Map.Entry<Consumer, Manga> entry : consumerMangaMap.entrySet()){
            System.out.println(entry.getKey().getName() + " - " + entry.getValue().getName());
        }
    }
}
