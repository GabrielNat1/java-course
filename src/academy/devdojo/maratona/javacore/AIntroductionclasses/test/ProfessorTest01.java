package academy.devdojo.maratona.javacore.AIntroductionclasses.test;

import academy.devdojo.maratona.javacore.AIntroductionclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "joao";
        professor.idade = 35;
        professor.sexo = 'M';

        System.out.println("o professor "+professor.nome + " tem "+ professor.idade+ " do sexo "+ professor.sexo);
    }
}
