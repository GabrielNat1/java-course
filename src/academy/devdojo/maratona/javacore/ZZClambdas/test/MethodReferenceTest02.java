package academy.devdojo.maratona.javacore.ZZClambdas.test;

import academy.devdojo.maratona.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.maratona.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("berserk", 3),
                new Anime("dragon ball", 4232),
                new Anime("pokemon", 42)));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);
    }
}
