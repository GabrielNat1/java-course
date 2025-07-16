package academy.devdojo.maratona.javacore.Kenum.domain;

public class Client {
    private final String name;
    private final TypeClient type;
    private final TypePayment typePayment;

    public Client(String name, TypeClient type, TypePayment typePayment) {
        this.name = name;
        this.type = type;
        this.typePayment = typePayment;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", type=" + type.getValue() +
                ", relatoryName=" + type.getRelatoryName() +
                ", typePayment=" + typePayment +
                '}';
    }
}