package academy.devdojo.maratona.javacore.Oexception.exception.test;

import academy.devdojo.maratona.javacore.Oexception.exception.domain.InvalidLoginException;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InvalidLoginExceptionTest01 {
    private static final Logger logger = Logger.getLogger(InvalidLoginExceptionTest01.class.getName());

    public static void main(String[] args) {
        try {
            login();
        } catch (InvalidLoginException e){
            logger.log(Level.SEVERE, "An error occurred during login", e);
        }
    }

    private static void login() throws InvalidLoginException{
        Scanner scanner = new Scanner(System.in);
        String usernameDB = "devdojo";
        String passwordDB = "123456";

        System.out.println("User");
        String usernameTyped = scanner.nextLine();
        System.out.println("Password");
        String passwordTyped = scanner.nextLine();

        if (!usernameDB.equals(usernameTyped) || !passwordDB.equals(passwordTyped)) {
            throw new InvalidLoginException("Invalid username or password");
        }

        System.out.println("User logged in successfully");
    }
}
