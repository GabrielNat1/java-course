package academy.devdojo.maratona.javacore.Gassociation.test;

import academy.devdojo.maratona.javacore.Gassociation.domain.Escola;
import academy.devdojo.maratona.javacore.Gassociation.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("jiraya");
        Professor professor2 = new Professor("rpofessor2");

        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("konoha", professores);

        escola.imprime();
    }
}
