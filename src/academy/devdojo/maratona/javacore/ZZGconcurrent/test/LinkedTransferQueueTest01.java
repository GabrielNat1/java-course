package academy.devdojo.maratona.javacore.ZZGconcurrent.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        TransferQueue<Object> objectTransferQueue = new LinkedTransferQueue<>();
        System.out.println(objectTransferQueue.add("teste"));
        System.out.println(objectTransferQueue.offer("teste12"));

        System.out.println(objectTransferQueue.offer("teste", 10, TimeUnit.SECONDS));
        objectTransferQueue.put("teste32");
        if(objectTransferQueue.hasWaitingConsumer()){
            objectTransferQueue.transfer("goku");
        }
        System.out.println(objectTransferQueue.tryTransfer("teste33"));
        System.out.println(objectTransferQueue.tryTransfer("teste34", 5, TimeUnit.SECONDS));
        System.out.println(objectTransferQueue.element());
        System.out.println(objectTransferQueue.peek());
        System.out.println(objectTransferQueue.poll());
        System.out.println(objectTransferQueue.remove());
        System.out.println(objectTransferQueue.take());
        System.out.println(objectTransferQueue.remainingCapacity());
    }
}
