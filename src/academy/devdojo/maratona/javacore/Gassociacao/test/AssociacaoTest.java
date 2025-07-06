package academy.devdojo.maratona.javacore.Gassociacao.test;

import academy.devdojo.maratona.javacore.Gassociacao.domain.Aluno;
import academy.devdojo.maratona.javacore.Gassociacao.domain.Local;
import academy.devdojo.maratona.javacore.Gassociacao.domain.Professor;
import academy.devdojo.maratona.javacore.Gassociacao.domain.Seminario;

/*
            Crie um sistema que gerencie seminários

            O sistema deverá cadastrar seminarios, estudantes, professores e local aonde sera realizado

            um aluno podera estar em apenas um seminario
            um seminario podera ter nenhum ou varios alunos
            um professor podera ministrar varios seminarios
            um seminario deve ter um local

            campos basicos (excluindo relacionamento)
            seminario: titulo
            aluno: nome e idade
            professor: nome, especialidade
            local: endereço
         */

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("rua teste 01");
        Aluno aluno = new Aluno("aluno1", 20);
        Professor professor = new Professor("professor01", "matematica");

        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("seminario de matematica", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
