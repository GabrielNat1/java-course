package academy.devdojo.maratona.javacore.ZZFthreads.test;

public class DeadLockTest01 {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Runnable r1 = () -> {
            synchronized (lock1){
                System.out.println("Thread 1: holding lock 1");
                System.out.println("Thread 1: waiting lock 2");
                synchronized (lock2){
                    System.out.println("Thread 1: holding lock 2");
                }
            }
        };

        Runnable r2 = () -> {
            synchronized (lock2){
                System.out.println("Thread 2: holding lock 2");
                System.out.println("Thread 2: waiting lock 1");
                synchronized (lock1){
                    System.out.println("Thread 2: holding lock 1");
                }
            }
        };

        new Thread(r1).start();
        new Thread(r2).start();
    }
}
