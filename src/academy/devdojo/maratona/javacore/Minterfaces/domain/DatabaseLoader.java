package academy.devdojo.maratona.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Loading data from the database...");
    }
}
