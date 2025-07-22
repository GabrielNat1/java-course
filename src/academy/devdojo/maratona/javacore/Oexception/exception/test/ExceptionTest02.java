package academy.devdojo.maratona.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionTest02 {
    private static final Logger logger = Logger.getLogger(ExceptionTest02.class.getName());

    public static void main(String[] args) throws IOException {
        createNewFile();
    }

    private static void createNewFile() throws IOException {
        File file = new File("file\\test.txt");
        try{
            boolean isCreate = file.createNewFile();
            System.out.println("File create " + isCreate);
        } catch (IOException e){
            logger.log(Level.SEVERE, "An error occurred while creating the file", e);
            throw e;
        }
    }
}
