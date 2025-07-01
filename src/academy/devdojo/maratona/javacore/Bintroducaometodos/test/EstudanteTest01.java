package academy.devdojo.maratona.javacore.Bintroducaometodos.test;

import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "aluno01";
        estudante01.idade = 12;
        estudante01.sexo = 'M';

        estudante02.nome = "aluno02";
        estudante02.idade = 13;
        estudante02.sexo = 'F';

        System.out.println(estudante01.nome);

        Estudante[] estudantes = {estudante01, estudante02};

        for(Estudante estudante : estudantes){
            System.out.println("\n--------------------------");
            System.out.println("Nome: " + estudante.nome);
            System.out.println("Idade: " + estudante.idade);
            System.out.println("sexo: " + estudante.sexo);
            System.out.println("--------------------------");
        }
    }
}