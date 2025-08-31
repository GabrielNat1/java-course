package academy.devdojo.maratona.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// File
// FileWriter
// FileReader
// BufferedReader
// BufferedWriter
public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true)) {
            fw.write("teste");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
