package academy.devdojo.maratona.javacore.ZZDoptional.repository;

import academy.devdojo.maratona.javacore.ZZDoptional.domain.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(
            new Manga(1, "berserk", 50, "Dark fantasy", 16),
            new Manga(0, "dragon ball z", 43, "Action", 14));

    public static Optional<Manga> findByClassification(int classification){
        return findBy(m -> m.getClassification().equals(classification));
    }

    public static Optional<Manga> findByGenre(String genre){
        return findBy(m -> m.getGenre().equals(genre));
    }

    public static Optional<Manga> findyById(Integer id){
        return findBy(m -> m.getId().equals(id));
    }

    public static Optional<Manga> findyByTitle(String title){
        return findBy(m -> m.getTitle().equals(title));
    }

    private static Optional<Manga> findBy(Predicate<Manga> predicate){
        Manga found = null;
        for (Manga manga : mangas){
            if (predicate.test(manga)){
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }
}
