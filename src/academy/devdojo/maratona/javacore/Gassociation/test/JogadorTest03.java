package academy.devdojo.maratona.javacore.Gassociation.test;

import academy.devdojo.maratona.javacore.Gassociation.domain.Jogador;
import academy.devdojo.maratona.javacore.Gassociation.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("joão paulo");
        Jogador jogador02 = new Jogador("jogadortest");
        Time time = new Time("brasil");
        Time time1 = new Time("uruguai");

        Jogador[] jogadores = {jogador01, jogador02};

        jogador01.setTime(time);
        jogador02.setTime(time1);
        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador01.imprime();
        jogador02.imprime();

        System.out.println("--- Time ---");
        time.imprime();
        time1.imprime();
    }
}
