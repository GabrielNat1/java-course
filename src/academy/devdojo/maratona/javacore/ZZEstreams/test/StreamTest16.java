package academy.devdojo.maratona.javacore.ZZEstreams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 100_000_000;
        //sumFor(num);
        sumStreamIterate(num);
        sumParallelStreamIterate(num);
        sumLongStreamIterate(num);
    }

    private static void sumStreamIterate(long num) {
        System.out.println("sum StreamIterate");
        long init = System.currentTimeMillis();

        long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end = init) + "ms");
    }

    // [1,2,3,4,5,6,7,8,9,10]
    // 1 - 1-5
    // 2 - 2-4
    private static void sumParallelStreamIterate(long num){
        System.out.println("sum ParallelStreamIterate");
        long init = System.currentTimeMillis();

        long result = Stream.iterate(1L, i -> i+1).limit(num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end = init) + "ms");
    }

    private static void sumLongStreamIterate(long num){
        System.out.println("sum LongStreamIterate");
        long init = System.currentTimeMillis();

        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end = init) + "ms");
    }

    private static void sumParallelLongStreamIterate(long num){
        System.out.println("sum ParallelLongStreamIterate");
        long init = System.currentTimeMillis();

        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end = init) + "ms");
    }
}
