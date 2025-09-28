package academy.devdojo.maratona.javacore.Bintroductionmethods.test;

import academy.devdojo.maratona.javacore.Bintroductionmethods.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.soma();

        calculadora.substrai();

        System.out.println("finalizando programa");
    }
}
