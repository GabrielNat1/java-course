package academy.devdojo.maratona.javacore.Gassociation.test;

import academy.devdojo.maratona.javacore.Gassociation.domain.Jogador;
import academy.devdojo.maratona.javacore.Gassociation.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("pele");
        Time time = new Time("seleção brasileira");

        jogador1.setTime(time);

        jogador1.imprime();
    }
}
