package academy.devdojo.maratona.javacore.ZZAinnerclasses.test;

class Animal{
    public void walk(){
        System.out.println("Animal walk");
    }
}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Walking");
            }
        };
        animal.walk();
    }
}
