package academy.devdojo.maratona.javacore.Gassociacao.test;

import academy.devdojo.maratona.javacore.Gassociacao.domain.Jogador;
import academy.devdojo.maratona.javacore.Gassociacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("pele");
        Time time = new Time("seleção brasileira");

        jogador1.setTime(time);

        jogador1.imprime();
    }
}
