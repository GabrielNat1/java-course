package academy.devdojo.maratona.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover {
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
}
