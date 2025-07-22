package academy.devdojo.maratona.javacore.Oexception.exception.domain;

public class Employee extends Person{
    public void save() throws InvalidLoginException, ArithmeticException{
        System.out.println("Saving employee");
    }
}
