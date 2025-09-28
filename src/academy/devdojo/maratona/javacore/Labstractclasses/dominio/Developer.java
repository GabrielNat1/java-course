package academy.devdojo.maratona.javacore.Labstractclasses.dominio;

public class Developer extends Employee{
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calculateBonus() {
        this.salary = this.salary + salary * 0.05;
    }

    @Override
    public void print() {
        super.print();
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
