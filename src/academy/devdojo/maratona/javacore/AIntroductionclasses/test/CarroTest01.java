package academy.devdojo.maratona.javacore.AIntroductionclasses.test;

import academy.devdojo.maratona.javacore.AIntroductionclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Toyota Corolla";
        carro1.modelo = "Altis 2.0 Flex";
        carro1.ano = 2023;

        carro2.nome = "Chevrolet Onix";
        carro2.modelo = "Premier 1.0 Turbo";
        carro2.ano = 2024;

        Carro[] carros = {carro1, carro2};
        int contadorindex = 1;

        for (Carro carro : carros) {
            System.out.println("\n--------------------------");
            System.out.println("Carro " + contadorindex + ":");
            System.out.println(carro.nome);
            System.out.println(carro.modelo);
            System.out.println(carro.ano);
            System.out.println("--------------------------");
            contadorindex++;
        }
    }
}
