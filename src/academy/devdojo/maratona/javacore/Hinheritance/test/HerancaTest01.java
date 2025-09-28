package academy.devdojo.maratona.javacore.Hinheritance.test;

import academy.devdojo.maratona.javacore.Hinheritance.dominio.Endereco;
import academy.devdojo.maratona.javacore.Hinheritance.dominio.Funcionario;
import academy.devdojo.maratona.javacore.Hinheritance.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("rua 21");
        endereco.setCep("12345-678");

        Pessoa pessoa = new Pessoa("João");

        System.out.println("------------------");
        pessoa.setCpf("332320");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println("------------------");

        Funcionario funcionario = new Funcionario("funcionario1");

        funcionario.setCpf("123456789");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000.0);

        funcionario.imprime();
    }
}
