package academy.devdojo.maratona.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Goku", "Vegeta", "Guts"));
        list.sort(String::compareTo);
        System.out.println(list);

        Function<String, Integer> numStringToInteger = Integer::parseInt;
        Integer apply = numStringToInteger.apply("10");
        System.out.println(apply);

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(list, "Goku"));
    }
}
