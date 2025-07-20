package academy.devdojo.maratona.javacore.Npolimorfismo.service;

import academy.devdojo.maratona.javacore.Npolimorfismo.repository.Repository;

public class RepositoryMemory implements Repository {
    @Override
    public void save() {
        System.out.println("Saving in memory");
    }
}
