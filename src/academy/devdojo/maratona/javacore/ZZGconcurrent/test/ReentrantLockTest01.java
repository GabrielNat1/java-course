package academy.devdojo.maratona.javacore.ZZGconcurrent.test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Worker implements Runnable{
    private String name;
    private ReentrantLock lock;

    public Worker(String name, ReentrantLock lock) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        try{
            lock.tryLock(2, TimeUnit.SECONDS);
            if (lock.isHeldByCurrentThread()){
                System.out.printf("Thread %s catch lock", name);
            }
            System.out.printf("Thread %s entry in section critic", name);
            System.out.printf("%d Threads waiting in queue", lock.getQueueLength());
            System.out.printf("Thread %s waiting 2 seconds", name);

            Thread.sleep(2000);
            System.out.print("Thread finally waiting");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            if (lock.isHeldByCurrentThread()){
                lock.unlock();
            }

        }
    }
}

public class ReentrantLockTest01 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock(true);
        new Thread(new Worker("A", lock)).start();
        new Thread(new Worker("B", lock)).start();
        new Thread(new Worker("C", lock)).start();
        new Thread(new Worker("D", lock)).start();
        new Thread(new Worker("F", lock)).start();
        new Thread(new Worker("G", lock)).start();
        new Thread(new Worker("H", lock)).start();
    }
}
