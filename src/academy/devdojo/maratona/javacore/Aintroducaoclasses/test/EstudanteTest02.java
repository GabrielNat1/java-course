package academy.devdojo.maratona.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratona.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "aluno1";
        estudante1.idade = 32;
        estudante1.sexo = 'M';

        estudante2.nome = "aluno2";
        estudante2.idade = 26;
        estudante2.sexo = 'F';

        Estudante[] estudantes = {estudante1, estudante2};

        for (Estudante estudante : estudantes){
            System.out.println("\n--------------------------");
            System.out.println("Nome: " + estudante.nome);
            System.out.println("Idade: " + estudante.idade);
            System.out.println("sexo: " + estudante.sexo);
            System.out.println("--------------------------");
        }
    }
}
