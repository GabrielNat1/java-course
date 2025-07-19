package academy.devdojo.maratona.javacore.Lclassesabstratas.dominio;

public class Manager extends Employee{
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calculateBonus() {
        this.salary = this.salary + salary * 0.1;
    }

    @Override
    public void print() {
        super.print();
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
