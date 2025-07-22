package academy.devdojo.maratona.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RuntimeExceptionTest04 {
    private static final Logger logger = Logger.getLogger(RuntimeExceptionTest04.class.getName());

    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            logger.log(Level.SEVERE, "Array index out of bounds exception occurred", e);
        } catch (IndexOutOfBoundsException e) {
            logger.log(Level.SEVERE, "Index out of bounds exception occurred", e);
        } catch (RuntimeException e) {
            logger.log(Level.SEVERE, "An unexpected exception occurred", e);
        }

        try {
            maybeLaunchException();
        } catch (SQLException | FileNotFoundException e) {
            logger.log(Level.SEVERE, "exception occurred", e);
        }
    }

    private static void maybeLaunchException() throws SQLException, FileNotFoundException {
        System.out.println("Maybe launching an exception");
    }
}
