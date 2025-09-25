package academy.devdojo.maratona.javacore.Zgenerics.domain;

public class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
