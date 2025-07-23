package academy.devdojo.maratona.javacore.Qstring.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        concatString(100_000);
        long end = System.currentTimeMillis();

        System.out.println("Time spent " + (end - start) + "ms");
        System.out.println("-----------------------------------");

        start = System.currentTimeMillis();
        concatStringBuilder(100_000);
        end = System.currentTimeMillis();

        System.out.println("Time spent " + (end - start) + "ms");
        System.out.println("-----------------------------------");

        start = System.currentTimeMillis();
        concatStringBuffer(100_000);
        end = System.currentTimeMillis();

        System.out.println("Time spent " + (end - start) + "ms");
    }

    private static void concatString(int length){
        String text = "";
        for (int i = 0; i < length; i++) {
            text += i; // 0, 01, 012, 0123
        }
    }

    private static void concatStringBuilder(int length){
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int length){
        StringBuffer sb = new StringBuffer(length);
        for (int i = 0; i < length; i++) {
            sb.append(i);
        }
    }
}
