package academy.devdojo.maratona.javacore.Minterfaces.domain;

public interface DataLoader {
    void load();

    default void checkPermission() {
        System.out.println("Checking permission to load data...");
    }
}
