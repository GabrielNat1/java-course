package academy.devdojo.maratona.javacore.Bintroductionmethods.test;

import academy.devdojo.maratona.javacore.Bintroductionmethods.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "João";
        funcionario.idade = 30;
        funcionario.salario = new double[]{1500, 1700, 2000};

        funcionario.imprimirDados();
        funcionario.calcularMediaSalariosBD();
    }
}
