package academy.devdojo.maratona.javacore.ZZEstreams.test;

import academy.devdojo.maratona.javacore.ZZEstreams.domain.Category;
import academy.devdojo.maratona.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.maratona.javacore.ZZEstreams.domain.Promotion;

import java.util.*;
import java.util.stream.Collectors;

import static academy.devdojo.maratona.javacore.ZZEstreams.domain.Promotion.NORMAL_PRICE;
import static academy.devdojo.maratona.javacore.ZZEstreams.domain.Promotion.UNDER_PROMOTION;
import static java.util.stream.Collectors.*;


public class StreamTest15 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 3.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game no life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99,  Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99,  Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99,  Category.FANTASY),
            new LightNovel("Monogatari", 4.00, Category.ROMANCE)
    ));

    public static void main(String[] args) {
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        // Map<Category, List<Promotion>>
        Map<Category, Set<Promotion>> collect1 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest15::getPromotion, toSet())));
        System.out.println(collect1);

        Map<Category, LinkedHashSet<Promotion>> collect2 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, mapping(StreamTest15::getPromotion,
                        toCollection(LinkedHashSet::new))));
        System.out.println(collect2);
    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    }
}
