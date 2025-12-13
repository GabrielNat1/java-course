package academy.devdojo.maratona.javacore.ZZGconcurrent.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(1);
        blockingQueue.put("teste");
        System.out.printf("%s added the value%s%n", Thread.currentThread().getName(), blockingQueue.peek());
        System.out.println("trying to add new value");
        new Thread(new RemoveFromQueue(blockingQueue)).start();
        blockingQueue.put("teste2");
        System.out.printf("%s added the value%s%n", Thread.currentThread().getName(), blockingQueue.peek());
    }

    static class RemoveFromQueue implements Runnable{
        public final BlockingQueue<String> blockingQueue;

        RemoveFromQueue(BlockingQueue<String> blockingQueue) {
            this.blockingQueue = blockingQueue;
        }

        @Override
        public void run() {
            System.out.printf("%s going to sleep for 2s %n", Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.printf("%s removing to value from queue %s%n", Thread.currentThread().getName(), blockingQueue.take());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
