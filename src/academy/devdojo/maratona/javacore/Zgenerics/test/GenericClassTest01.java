package academy.devdojo.maratona.javacore.Zgenerics.test;

import academy.devdojo.maratona.javacore.Zgenerics.domain.Car;
import academy.devdojo.maratona.javacore.Zgenerics.service.ProfitableCartService;

public class GenericClassTest01 {
    public static void main(String[] args) {
        ProfitableCartService profitableCartService = new ProfitableCartService();
        Car availableCar = profitableCartService.findAvailableCar();
        System.out.println(".....");
        profitableCartService.returnRentedCar(availableCar);
    }
}
