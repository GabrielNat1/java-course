package academy.devdojo.maratona.javacore.ZZDoptional.test;

import academy.devdojo.maratona.javacore.ZZDoptional.domain.Manga;
import academy.devdojo.maratona.javacore.ZZDoptional.repository.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findyByTitle("berserk");
        mangaByTitle.ifPresent(m -> m.setTitle("berserk 2"));
        System.out.println(mangaByTitle);
        System.out.println("--------------------");

        Optional<Manga> mangaById = Optional.ofNullable(
                MangaRepository.findyById(0)
                        .orElseThrow(IllegalArgumentException::new));

        System.out.println(mangaById);

        Manga newManga = MangaRepository.findyByTitle("dragon ball")
                .orElseGet(() -> new Manga(3, "dragon ball", 43, "action"));
        System.out.println(newManga);

        Optional<Manga> mangaByGenre = Optional.ofNullable(MangaRepository.findByGenre("Dark fantasy")
                .orElseThrow(IllegalArgumentException::new));
        System.out.println(mangaByGenre);

        System.out.println("------------------------------------");

        Optional<Manga> mangaByClassification = Optional.ofNullable(MangaRepository.findByClassification(16)
                .orElseThrow(IllegalArgumentException::new));
        System.out.println(mangaByClassification);


    }
}
