package academy.devdojo.maratona.javacore.Einitializationblock.test;

import academy.devdojo.maratona.javacore.Einitializationblock.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        //System.out.println(anime.getEpisodios());

        for (int episodio : anime.getEpisodios()){
            System.out.println(episodio + " ");
        }
    }
}
