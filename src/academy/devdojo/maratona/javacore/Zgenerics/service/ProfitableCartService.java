package academy.devdojo.maratona.javacore.Zgenerics.service;

import academy.devdojo.maratona.javacore.Zgenerics.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ProfitableCartService {
    private List<Car> carAvailable = new ArrayList<>(
            List.of(new Car("bmw"),
                    new Car("uno")));

    public Car findAvailableCar(){
        System.out.println("searching car ...");
        Car car = carAvailable.remove(0);
        System.out.println("renting a car " + car);

        System.out.println("cars Available for rent:");
        System.out.println(carAvailable);
        return car;
    }

    public void returnRentedCar(Car car){
        System.out.println("returning car " + car);
        carAvailable.add(car);
        System.out.println("cars available for rent:");
        System.out.println(carAvailable);
    }
}
