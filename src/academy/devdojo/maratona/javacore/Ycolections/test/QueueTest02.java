package academy.devdojo.maratona.javacore.Ycolections.test;

import academy.devdojo.maratona.javacore.Ycolections.domain.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangaQueue = new PriorityQueue<>(new MangaPriceComparator().reversed());
        mangaQueue.add(new Manga(1L, "B manga1", 19.99));
        mangaQueue.add(new Manga(3L, "T manga2", 321.31));
        mangaQueue.add(new Manga(7L, "D manga3", 412.2));
        mangaQueue.add(new Manga(4L, "J manga4", 939.12));
        mangaQueue.add(new Manga(9L, "R manga5", 31.312));
        mangaQueue.add(new Manga(10L, "A manga5", 31.312));

        while (!mangaQueue.isEmpty()){
            System.out.println(mangaQueue.poll());
        }
    }
}
