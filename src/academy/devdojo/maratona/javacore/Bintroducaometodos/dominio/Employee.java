package academy.devdojo.maratona.javacore.Bintroducaometodos.dominio;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
 *   @create a class Employee with the following attributes: name, year, salary
 *   @create two methods: one to print data and another to calculate the average salary and print the result
 */
public class Employee {
    private String name;
    private int year;
    public double[] salary;

    public void printHeader(){
        System.out.println("--------------");
        System.out.println("name: "+ getName());
        System.out.println("year: "+ getYear());
    }

    public void setName(String name){
        this.name = name;
    }

    public void setYear(int year){
        this.year = year;
    }

    public String getName(){
        return this.name;
    }

    public int getYear(){
        return this.year;
    }

    public void printData() {
        System.out.println("-------------------");
        System.out.println("salaries");
        if (salary != null && salary.length == 3) {
            for (int i = 0; i < salary.length; i++) {
                System.out.println("Salary " + (i + 1) + ": R$ " + salary[i]);
            }
        } else {
            System.out.println("Invalid salaries, there must be 3.");
        }
    }

    /*
     * @Calculates the average of the salaries using BigDecimal to avoid rounding errors.
     * @Prints the result with two decimal places.
     * @Requires exactly 3 salaries to exist.
     */
    public void calculateAverageSalaryBD() {
        if (salary != null && salary.length == 3) {
            BigDecimal sum = BigDecimal.ZERO;
            for (double s : salary) {
                sum = sum.add(BigDecimal.valueOf(s));
            }
            BigDecimal average = sum.divide(BigDecimal.valueOf(3), 2, RoundingMode.HALF_UP);
            System.out.println("Average salary: R$ " + average);
            System.out.println("-------------------");
        } else {
            System.out.println("Unable to calculate the average. The employee must have 3 salaries.");
        }
    }

    public void calculateAverageSalary() {
        if (salary != null && salary.length == 3) {
            double sum = 0;
            for (double s : salary) {
                sum += s;
            }
            double average = sum / 3;
            System.out.println("Average salary: R$ " + average);
            System.out.println("-------------------");
        } else {
            System.out.println("Unable to calculate the average. The employee must have 3 salaries.");
        }
    }
}