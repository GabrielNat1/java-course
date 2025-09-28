package academy.devdojo.maratona.javacore.Bintroductionmethods.test;

import academy.devdojo.maratona.javacore.Bintroductionmethods.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divide(20, 2);
        System.out.println(result);
        System.out.println(calculadora.divide02(20, 0));
        System.out.println("\n --------------------- \n");
        calculadora.imprimedivisao(80, 0);
    }
}
