package academy.devdojo.maratona.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover {
    // private -> default -> protected -> public
    @Override
    public void load() {
        System.out.println("Loading data from the database...");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from the database...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permission to load data from the database...");
    }

    public static void printMaxDataSize() {
        System.out.println("Max data size in database loader class: " + MAX_DATA_SIZE);
    }
}
