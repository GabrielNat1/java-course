package academy.devdojo.maratona.javacore.Bintroducaometodos.dominio;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Funcionario {
    // crie uma classe funcionario com os seguintes atributos: nome, idade, salario
    // crie dois metodos, para imprimir dados e para tirar media dos salarios e imprimir resultado

    public String nome;
    public int idade;
    public double[] salario;

    public void imprimirDados(){
        System.out.println("-------------------");
        System.out.println("nome: "+this.nome);
        System.out.println("idade: "+this.idade);
        if (salario != null && salario.length == 3) {
            for (int i = 0; i < salario.length; i++) {
                System.out.println("Salário " + (i + 1) + ": R$ " + salario[i]);
            }
        } else {
            System.out.println("Salarios invalidos, devem ser 3");
        }
    }

    public void calcularMediaSalarios(){
        if (this.salario != null && this.salario.length == 3) {
            BigDecimal soma = BigDecimal.ZERO;
            for (double s : this.salario) {
                soma = soma.add(BigDecimal.valueOf(s));
            }
            BigDecimal media = soma.divide(BigDecimal.valueOf(3), 2, RoundingMode.HALF_UP);
            System.out.println("Média salarial: R$ " + media);
            System.out.println("-------------------");
        } else {
            System.out.println("Não é possível calcular a média. O funcionário deve ter 3 salários.");
        }
    }
}
