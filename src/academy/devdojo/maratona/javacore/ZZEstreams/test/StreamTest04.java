package academy.devdojo.maratona.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devDojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("designer1", "designer2", "designer3");
        List<String> developers = List.of("dev1", "dev2", "dev3");
        List<String> students = List.of("student1", "student2", "student3");

        devDojo.add(graphicDesigners);
        devDojo.add(developers);
        devDojo.add(students);

        for (List<String> people : devDojo){
            for (String person : people){
                System.out.println(person);
            }
        }

        System.out.println("---------------");
        devDojo.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);
    }
}
