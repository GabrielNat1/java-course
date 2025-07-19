package academy.devdojo.maratona.javacore.Minterfaces.domain;

public interface DataLoader {
    int MAX_DATA_SIZE = 1000;

    void load();

    default void checkPermission() {
        System.out.println("Checking permission to load data...");
    }

    static void printMaxDataSize() {
        System.out.println("Max data size: " + MAX_DATA_SIZE);
    }
}
