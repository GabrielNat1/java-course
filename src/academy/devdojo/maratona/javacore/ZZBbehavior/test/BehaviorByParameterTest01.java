package academy.devdojo.maratona.javacore.ZZBbehavior.test;

import academy.devdojo.maratona.javacore.ZZBbehavior.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class BehaviorByParameterTest01 {
    private static List<Car> cars = List.of(
            new Car("green", 2011),
            new Car("black", 1998),
            new Car("red", 2019));

    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println(filterCarByColor(cars, "green"));
        System.out.println(filterCarByAgeBefore(cars, 2015));
    }

    private static List<Car> filterGreenCar(List<Car> cars) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("green")) {
                greenCars.add(car);
            }
        }
        return greenCars;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color){
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars){
            if (car.getColor().equals(color)){
                filterCar.add(car);
            }
        }
        return filterCar;
    }

    private static List<Car> filterCarByAgeBefore(List<Car> cars, int year){
        List<Car> oldCars = new ArrayList<>();
        for (Car car : cars){
            if (car.getYear() < year){
                oldCars.add(car);
            }
        }
        return oldCars;
    }
}
