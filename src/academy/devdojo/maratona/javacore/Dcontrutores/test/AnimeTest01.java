package academy.devdojo.maratona.javacore.Dcontrutores.test;

import academy.devdojo.maratona.javacore.Dcontrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("anime1", "TV", 21, "ação", "Studio");

        anime.imprime();
    }
}
