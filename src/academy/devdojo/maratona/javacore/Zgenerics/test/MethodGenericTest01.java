package academy.devdojo.maratona.javacore.Zgenerics.test;

import academy.devdojo.maratona.javacore.Zgenerics.domain.Car;

import java.util.List;

public class MethodGenericTest01 {
    public static void main(String[] args) {
        List<Car> teste01 = createArrayObject(new Car("teste01"));
        System.out.println(teste01);
    }

//    private static <T extends Comparable<T>> List<T> createArrayObject(T t){
//        return List.of(t);
//    }

    private static <T> List<T> createArrayObject(T t){
        return List.of(t);
    }
}
