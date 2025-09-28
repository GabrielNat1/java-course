package academy.devdojo.maratona.javacore.Bintroductionmethods.test;

import academy.devdojo.maratona.javacore.Bintroductionmethods.dominio.Funcionario;

public class FuncionarioTest02 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "FuncionarioGoku123";
        funcionario.idade = 23;
        funcionario.salario = new double[]{1500, 1700, 2000};

        funcionario.imprimirDados();
        funcionario.calcularMediaSalarios();
    }
}
