package academy.devdojo.maratona.javacore.Bintroducaometodos.test;

import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "aluno01";
        estudante01.idade = 12;
        estudante01.sexo = 'M';

        estudante02.nome = "aluno02";
        estudante02.idade = 13;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
