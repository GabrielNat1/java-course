package academy.devdojo.maratona.javacore.Ycolections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(10);
        numbers.add(2);
        Collections.sort(numbers);
        System.out.println(numbers);
        System.out.println(Collections.binarySearch(numbers, 2));
    }
}
