package academy.devdojo.maratona.javacore.Oexception.exception.test;

import academy.devdojo.maratona.javacore.Oexception.exception.domain.Reader01;
import academy.devdojo.maratona.javacore.Oexception.exception.domain.Reader02;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TryWithResourcesTest01 {
    private static final Logger logger = Logger.getLogger(ExceptionTest02.class.getName());

    public static void main(String[] args) {

    }

    public static void readToFile() {
        try(Reader01 reader01 = new Reader01();
            Reader02 reader02 = new Reader02()){

        } catch (IOException e){
            logger.log(Level.SEVERE, "exception: ", e);
        }
    }

    public static void readToFile02(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("file.txt"));
        } catch (FileNotFoundException e){
            logger.log(Level.SEVERE, "exception: ", e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (Exception e) {
                logger.log(Level.SEVERE, "exception while closing the reader: ", e);
            }
        }

    }
}
