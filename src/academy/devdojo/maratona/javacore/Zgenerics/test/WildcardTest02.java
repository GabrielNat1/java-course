package academy.devdojo.maratona.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());
        printInspect(dogs);
        printInspect(cats);

        List<Animal> animals = new ArrayList<>();
        printInspectAnimal(animals);
    }

    private static void printInspect(List<? extends Animal> animals){
        for (Animal animal : animals) {
            animal.inspect();
        }
    }

    private static void printInspectAnimal(List<? super Animal> animals){
        animals.add(new Dog());
        animals.add(new Cat());
    }
}
