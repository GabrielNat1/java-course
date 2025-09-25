package academy.devdojo.maratona.javacore.Zgenerics.service;

import academy.devdojo.maratona.javacore.Zgenerics.domain.Car;

import java.util.List;

public class RentalService<T> {
    private List<T> availableObjects;
    public RentalService(List<T> availableObjects) {
        this.availableObjects = availableObjects;
    }

    public T findAvailableObject(){
        System.out.println("searching object ...");
        T t = availableObjects.remove(0);
        System.out.println("renting a object " + t);

        System.out.println("object available for rent:");
        System.out.println(availableObjects);
        return t;
    }

    public void returnRentedObject(T t){
        System.out.println("returning object " + t);
        availableObjects.add(t);
        System.out.println("object available for rent:");
        System.out.println(availableObjects);
    }
}
