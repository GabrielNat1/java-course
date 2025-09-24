package academy.devdojo.maratona.javacore.Zgenerics.test;

abstract class Animal{
    public abstract void inspect();
}

class Dog extends Animal{
    @Override
    public void inspect() {
        System.out.println("inspect dog");
    }
}

class Cat extends Animal{
    @Override
    public void inspect() {
        System.out.println("inspect cat");
    }
}

public class WildcardTest01 {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(), new Dog()};
        Cat[] cats = {new Cat(), new Cat()};
        printInspect(dogs);
        printInspect(cats);

        Animal[] animals = {new Cat(), new Dog()};
        printInspect(animals);
    }

    private static void printInspect(Animal[] animals){
        for (Animal animal : animals) {
            animal.inspect();
        }

    }
}
