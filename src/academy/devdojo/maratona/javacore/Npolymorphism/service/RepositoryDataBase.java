package academy.devdojo.maratona.javacore.Npolymorphism.service;

import academy.devdojo.maratona.javacore.Npolymorphism.repository.Repository;

public class RepositoryDataBase implements Repository {
    @Override
    public void save() {
        System.out.println("Saving in database");
    }
}
