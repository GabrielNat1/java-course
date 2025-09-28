package academy.devdojo.maratona.javacore.Npolymorphism.service;

import academy.devdojo.maratona.javacore.Npolymorphism.repository.Repository;

public class RepositoryMemory implements Repository {
    @Override
    public void save() {
        System.out.println("Saving in memory");
    }
}
