package academy.devdojo.maratona.javacore.Gassociation.test;

import academy.devdojo.maratona.javacore.Gassociation.domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("pelé");
        Jogador jogador2 = new Jogador("pelé");
        Jogador jogador3 = new Jogador("pelé");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores){
            jogador.imprime();
        }
    }
}
