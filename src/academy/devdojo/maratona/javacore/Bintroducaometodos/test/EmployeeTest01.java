package academy.devdojo.maratona.javacore.Bintroducaometodos.test;

import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee employee1 = new Employee();

        employee.setName("teste1");
        employee.setYear(2004);
        employee.salary = new double[]{1500, 1700, 2000};

        employee1.setName("teste2");
        employee1.setYear(2005);
        employee1.salary = new double[]{3243, 1323, 2131};

        employee.printHeader();

        System.out.println("------------------");

        employee.printData();
        System.out.println("----------------");
        System.out.println("calculate avarage salary DB");
        employee.calculateAverageSalaryBD();
        System.out.println("\n----------------");
        System.out.println("calculate avarage salary");
        employee.calculateAverageSalary();

        employee1.printHeader();

        System.out.println("------------------");

        employee1.printData();
        System.out.println("----------------");
        System.out.println("calculate avarage salary DB");
        employee1.calculateAverageSalaryBD();
        System.out.println("\n----------------");
        System.out.println("calculate avarage salary");
        employee1.calculateAverageSalary();
    }
}
