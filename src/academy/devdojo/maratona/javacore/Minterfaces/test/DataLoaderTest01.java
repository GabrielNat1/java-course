package academy.devdojo.maratona.javacore.Minterfaces.test;

import academy.devdojo.maratona.javacore.Minterfaces.domain.DataLoader;
import academy.devdojo.maratona.javacore.Minterfaces.domain.DatabaseLoader;
import academy.devdojo.maratona.javacore.Minterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DatabaseLoader.printMaxDataSize();
        DataLoader.printMaxDataSize();
    }
}
