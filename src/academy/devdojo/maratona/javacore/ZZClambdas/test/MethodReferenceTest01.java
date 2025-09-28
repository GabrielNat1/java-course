package academy.devdojo.maratona.javacore.ZZClambdas.test;

import academy.devdojo.maratona.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.maratona.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("berserk", 3),
                new Anime("dragon ball", 4232),
                new Anime("pokemon", 42)));

//        Collections.sort(animeList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        Collections.sort(animeList, AnimeComparators::compareByEpisodes);
        System.out.println(animeList);
    }
}
