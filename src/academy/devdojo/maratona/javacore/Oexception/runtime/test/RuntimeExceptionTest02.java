package academy.devdojo.maratona.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        division(1, 0);

        System.out.println("End of program");
    }

    /**
     *
     * @param a
     * @param b not zero
     * @return
     * @throws IllegalArgumentException if b is zero
     */
    private static int division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }

        return a / b;
    }
}
