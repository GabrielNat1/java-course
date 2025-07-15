package academy.devdojo.maratona.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratona.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.maratona.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.comprador);
        carro.comprador.setNome("Goku");
        System.out.println(carro.comprador);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("F40");
        System.out.println(ferrari.getNome());
    }
}
