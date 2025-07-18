package academy.devdojo.maratona.javacore.Kenum.domain;

public enum TypeClient {
    NATURAL_PERSON(1, "natural person"),
    LEGAL_ENTITY(2, "legal entity");

    private final int value;
    private final String relatoryName;

    TypeClient(int value, String relatoryName) {
        this.value = value;
        this.relatoryName = relatoryName;
    }

    public static TypeClient typeClientByRelatory(String relatoryName){
        for (TypeClient typeClient : values()){
            if (typeClient.getRelatoryName().equalsIgnoreCase(relatoryName)) {
                return typeClient;
            }
        }

        return null;
    }

    public int getValue() {
        return value;
    }

    public String getRelatoryName() {
        return relatoryName;
    }
}
