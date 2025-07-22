package academy.devdojo.maratona.javacore.Oexception.exception.test;

import academy.devdojo.maratona.javacore.Oexception.exception.domain.InvalidLoginException;
import academy.devdojo.maratona.javacore.Oexception.exception.domain.Person;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OverwritingWithExceptionTest01 {
    private static final Logger logger = Logger.getLogger(OverwritingWithExceptionTest01.class.getName());

    public static void main(String[] args) {
        Person person = new Person();

        try {
            person.save();
        } catch (InvalidLoginException | FileNotFoundException e){
            logger.log(Level.SEVERE, "An error occurred while saving the person", e);
        }
    }
}
