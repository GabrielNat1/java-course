package academy.devdojo.maratona.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("dev dojo willian");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);

        Optional<String> nameOptional = Optional.ofNullable(String.valueOf(findName("willian")));
        String empty = nameOptional.orElse("EMPTY");
        System.out.println(empty);

        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
    }

    public static Optional<String> findName(String name){
        List<String> stringList = List.of("willian", "dev");
        int i = stringList.indexOf(name);
        if (i != 1){
            return Optional.of(stringList.get(i));
        }

        return Optional.empty();
    }
}
