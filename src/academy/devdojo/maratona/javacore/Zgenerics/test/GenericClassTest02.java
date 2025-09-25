package academy.devdojo.maratona.javacore.Zgenerics.test;

import academy.devdojo.maratona.javacore.Zgenerics.domain.Boat;
import academy.devdojo.maratona.javacore.Zgenerics.domain.Car;
import academy.devdojo.maratona.javacore.Zgenerics.service.ProfitableBoatService;
import academy.devdojo.maratona.javacore.Zgenerics.service.ProfitableCartService;

public class GenericClassTest02 {
    public static void main(String[] args) {
        ProfitableBoatService profitableBoatService = new ProfitableBoatService();
        Boat availableBoat = profitableBoatService.findAvailableBoat();
        System.out.println(".....");
        profitableBoatService.returnRentedBoat(availableBoat);
    }
}
