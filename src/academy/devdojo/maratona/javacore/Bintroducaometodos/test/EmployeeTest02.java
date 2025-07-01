package academy.devdojo.maratona.javacore.Bintroducaometodos.test;

import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.Employee;

public class EmployeeTest02 {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setName("teste2");
        employee.setYear(2003);
        employee.salary = new double[]{1500, 1700, 2000};


        employee.printHeader();

        System.out.println("----------------");
        System.out.println("calculate avarage salary DB");
        employee.calculateAverageSalaryBD();
        System.out.println("\n----------------");
        System.out.println("calculate avarage salary");
        employee.calculateAverageSalary();
    }
}