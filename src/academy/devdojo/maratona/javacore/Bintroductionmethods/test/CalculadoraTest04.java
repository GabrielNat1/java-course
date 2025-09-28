package academy.devdojo.maratona.javacore.Bintroductionmethods.test;

import academy.devdojo.maratona.javacore.Bintroductionmethods.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int a = 10;
        int b = 20;
        calculadora.alteradoisnumeros(a, b);
        System.out.println("\n----------------------");
        System.out.println("dentro da calculadora 04");
        System.out.println("num1 "+ a);
        System.out.println("num2 "+ b);
    }
}
