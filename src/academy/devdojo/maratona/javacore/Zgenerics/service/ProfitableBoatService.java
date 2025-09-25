package academy.devdojo.maratona.javacore.Zgenerics.service;

import academy.devdojo.maratona.javacore.Zgenerics.domain.Boat;

import java.util.ArrayList;
import java.util.List;

public class ProfitableBoatService {
    private List<Boat> boatAvaibles = new ArrayList<>(
            List.of(new Boat("Wood Ship Model"),
                    new Boat("Boat Scale Wood")));

    public Boat findAvailableBoat(){
        System.out.println("searching Boat ...");
        Boat Boat = boatAvaibles.remove(0);
        System.out.println("renting a Boat " + Boat);

        System.out.println("Boats available for rent:");
        System.out.println(boatAvaibles);
        return Boat;
    }

    public void returnRentedBoat(Boat boat){
        System.out.println("returning Boat " + boat);
        boatAvaibles.add(boat);
        System.out.println("Boats available for rent:");
        System.out.println(boatAvaibles);
    }
}
