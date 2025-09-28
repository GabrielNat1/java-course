package academy.devdojo.maratona.javacore.ZZClambdas.test;

import academy.devdojo.maratona.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.maratona.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparators.get();
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("berserk", 3),
                new Anime("dragon ball", 4232),
                new Anime("pokemon", 42)));

        BiFunction<String, Integer, Anime> animeBiFunction = Anime::new;
        System.out.println(animeBiFunction.apply("dragon ball z", 78));
    }
}
