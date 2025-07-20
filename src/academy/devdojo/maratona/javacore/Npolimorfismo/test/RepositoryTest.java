package academy.devdojo.maratona.javacore.Npolimorfismo.test;

import academy.devdojo.maratona.javacore.Npolimorfismo.repository.Repository;
import academy.devdojo.maratona.javacore.Npolimorfismo.service.RepositoryDataBase;

//import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositoryTest {
    public static void main(String[] args) {
        Repository repository = new RepositoryDataBase();
        repository.save();

        List<String> list = new LinkedList<>();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        System.out.println(list);
    }
}
