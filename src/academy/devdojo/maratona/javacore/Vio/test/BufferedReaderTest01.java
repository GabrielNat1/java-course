package academy.devdojo.maratona.javacore.Vio.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        final Logger logger = Logger.getLogger(BufferedReaderTest01.class.getName());
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            logger.log(Level.SEVERE, "An error occurred while reading the file", e);
        }
    }
}
