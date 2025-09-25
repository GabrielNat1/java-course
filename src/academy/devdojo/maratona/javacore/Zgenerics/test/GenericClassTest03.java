package academy.devdojo.maratona.javacore.Zgenerics.test;

import academy.devdojo.maratona.javacore.Zgenerics.domain.Boat;
import academy.devdojo.maratona.javacore.Zgenerics.domain.Car;
import academy.devdojo.maratona.javacore.Zgenerics.service.ProfitableBoatService;
import academy.devdojo.maratona.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class GenericClassTest03 {
    public static void main(String[] args) {
        List<Car> carAvailable = new ArrayList<>(
                List.of(new Car("bmw"),
                        new Car("uno")));

        List<Boat> boatAvailable = new ArrayList<>(
                List.of(new Boat("Wood Ship Model"),
                        new Boat("Boat Scale Wood")));

        RentalService<Car> rentalServiceCar = new RentalService<>(carAvailable);
        Car car = rentalServiceCar.findAvailableObject();
        System.out.println("....");
        rentalServiceCar.returnRentedObject(car);

        System.out.println("----------------------------");

        RentalService<Boat> rentalServiceBoat = new RentalService<>(boatAvailable);
        Boat boat = rentalServiceBoat.findAvailableObject();
        System.out.println("....");
        rentalServiceBoat.returnRentedObject(boat);
    }
}
