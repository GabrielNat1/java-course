package academy.devdojo.maratona.javacore.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileReaderTest01 {
    public static void main(String[] args) {
        final Logger logger = Logger.getLogger(FileReaderTest01.class.getName());
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file)){
//            char[] in = new char[1];
//            int size = fr.read(in);
//            System.out.println(size);
//            for (char c : in) {
//                System.out.print(c);
//            }
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, "An error occurred while reading the file", e);
        }
    }
}
