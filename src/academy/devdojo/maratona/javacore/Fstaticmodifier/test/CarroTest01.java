package academy.devdojo.maratona.javacore.Fstaticmodifier.test;

import academy.devdojo.maratona.javacore.Fstaticmodifier.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);

        Carro.velocidadeLimite = 180;

        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
