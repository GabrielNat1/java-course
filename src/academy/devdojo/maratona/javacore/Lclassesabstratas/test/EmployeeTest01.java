package academy.devdojo.maratona.javacore.Lclassesabstratas.test;

import academy.devdojo.maratona.javacore.Lclassesabstratas.dominio.Developer;
//import academy.devdojo.maratona.javacore.Lclassesabstratas.dominio.Employee;
import academy.devdojo.maratona.javacore.Lclassesabstratas.dominio.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Manager manager = new Manager("Vegeta", 10000);
        Developer developer = new Developer("Goku", 8000);
        System.out.println(manager);
        System.out.println(developer);
    }
}
