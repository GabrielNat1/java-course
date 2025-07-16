package academy.devdojo.maratona.javacore.Kenum.domain;

public class Client {
    private String name;
    private TypeClient type;

    public Client(String name, TypeClient type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeClient getType() {
        return type;
    }

    public void setType(TypeClient type) {
        this.type = type;
    }
}