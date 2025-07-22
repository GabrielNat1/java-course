package academy.devdojo.maratona.javacore.Oexception.exception.domain;

import java.io.FileNotFoundException;

public class Person {
    public void save() throws InvalidLoginException, FileNotFoundException {
        System.out.println("Saving Person");
        //throw new InvalidLoginException("Invalid login");
    }
}
