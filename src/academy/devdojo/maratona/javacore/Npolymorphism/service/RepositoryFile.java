package academy.devdojo.maratona.javacore.Npolymorphism.service;

import academy.devdojo.maratona.javacore.Npolymorphism.repository.Repository;

public class RepositoryFile implements Repository {
    @Override
    public void save() {
        System.out.println("Saving in file");
    }
}
