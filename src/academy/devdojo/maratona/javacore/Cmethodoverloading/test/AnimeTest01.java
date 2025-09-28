package academy.devdojo.maratona.javacore.Cmethodoverloading.test;

import academy.devdojo.maratona.javacore.Cmethodoverloading.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        //anime.init("anime1", "TV", 21);
        anime.init("anime1", "TV", 21, "ação");

        anime.imprime();
    }
}
