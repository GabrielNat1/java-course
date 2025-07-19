package academy.devdojo.maratona.javacore.Lclassesabstratas.dominio;

public abstract class Employee extends Person{
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        calculateBonus();
    }

    @Override
    public void print() {
        System.out.println("Name: " + name);
    }

    public abstract void calculateBonus();

}
