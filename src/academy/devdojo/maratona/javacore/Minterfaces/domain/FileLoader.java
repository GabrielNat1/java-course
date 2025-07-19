package academy.devdojo.maratona.javacore.Minterfaces.domain;

public class FileLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("Loading data from a file...");
    }
}
