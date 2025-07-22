package academy.devdojo.maratona.javacore.Oexception.runtime.test;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RuntimeExceptionTest03 {
    private static final Logger logger = Logger.getLogger(RuntimeExceptionTest03.class.getName());

    public static void main(String[] args) {
        createConnection();

        System.out.println("end of program 01");
        System.out.println("--------------");

        createConnection02();
        System.out.println("end of program 02");
    }

    private static String createConnection(){
        try {
            System.out.println("Opening connection");
            System.out.println("Writing data");
            return "Connection successful";
        } catch (Exception e){
            logger.log(Level.SEVERE, "An error occurred while creating the connection", e);
        } finally {
            System.out.println("Closing connection");
        }

        return null;
    }

    private static void createConnection02(){
        try {
            System.out.println("Opening connection");
            System.out.println("Writing data");
            throw new RuntimeException();
        } finally {
            System.out.println("Closing connection");
        }
    }
}
