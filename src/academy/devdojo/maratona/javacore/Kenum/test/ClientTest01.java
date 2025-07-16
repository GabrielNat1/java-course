package academy.devdojo.maratona.javacore.Kenum.test;

import academy.devdojo.maratona.javacore.Kenum.domain.Client;
import academy.devdojo.maratona.javacore.Kenum.domain.TypeClient;
import academy.devdojo.maratona.javacore.Kenum.domain.TypePayment;

public class ClientTest01 {
    public static void main(String[] args) {
        Client client1 = new Client("Goku", TypeClient.NATURAL_PERSON, TypePayment.DEBIT_CARD);
        Client client2 = new Client("Vegeta", TypeClient.LEGAL_ENTITY, TypePayment.CREDIT_CARD);

        System.out.println(client1);
        System.out.println(client2);

        System.out.println(TypePayment.DEBIT_CARD.calculateDiscount(100));

        TypeClient typeClient = TypeClient.valueOf("NATURAL_PERSON");
        System.out.println(typeClient);

        TypeClient typeClient02 = TypeClient.typeClientByRelatory("legal entity");
        System.out.println(typeClient02);
    }
}
