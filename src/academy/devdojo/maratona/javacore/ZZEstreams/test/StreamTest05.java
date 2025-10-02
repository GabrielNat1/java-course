package academy.devdojo.maratona.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> words = List.of("Gomu", "Gomu", "no", "mi");
        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));

        List<String[]> collect = words.stream()
                .map(w -> w.split(""))
                .collect(Collectors.toList());

        Stream<String> stream = Arrays.stream(letters);

        List<String> letters2 = words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        System.out.println(letters2 );
    }
}
