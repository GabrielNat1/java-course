package academy.devdojo.maratona.javacore.Dconstructor.test;

import academy.devdojo.maratona.javacore.Dconstructor.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("anime1", "TV", 21, "ação", "Studio");

        anime.imprime();
    }
}
