package academy.devdojo.maratona.javacore.Kenum.domain;

public enum TypeClient {
    NATURAL_PERSON(1, "NATURAL_PERSON"),
    LEGAL_ENTITY(2, "LEGAL_ENTITY");

    private final int value;
    private final String relatoryName;

    TypeClient(int value, String relatoryName) {
        this.value = value;
        this.relatoryName = relatoryName;
    }

    public int getValue() {
        return value;
    }

    public String getRelatoryName() {
        return relatoryName;
    }
}
