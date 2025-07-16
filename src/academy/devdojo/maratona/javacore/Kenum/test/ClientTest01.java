package academy.devdojo.maratona.javacore.Kenum.test;

import academy.devdojo.maratona.javacore.Kenum.domain.Client;
import academy.devdojo.maratona.javacore.Kenum.domain.TypeClient;

public class ClientTest01 {
    public static void main(String[] args) {
        Client client1 = new Client("Goku", TypeClient.LEGAL_ENTITY);
        System.out.println(client1);
    }
}
