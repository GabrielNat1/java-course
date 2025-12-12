package academy.devdojo.maratona.javacore.ZZGconcurrent.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private boolean open = true;

    public boolean isOpen(){
        return open;
    }

    public int pendingEmails(){
        lock.lock();
        try{
            return emails.size();
        } finally {
            lock.unlock();
        }


    }

    public void addMemberEmail(String email){
        lock.lock();

        try{
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " addiction email in list");

            this.emails.add(email);
            this.emails.notifyAll();
            condition.signalAll();
        } finally {
            lock.unlock();
        }

    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " checking if there are emails");

        lock.lock();
        try{
            while (this.emails.isEmpty()){
                if (!open) return null;
                System.out.println(Thread.currentThread().getName() + " no email available in the list, entering standby mode");
                condition.await();
            }

            return this.emails.poll();
        } finally {
            lock.unlock();
        }
    }

    public void close(){
        open = false;
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName() + " it is no longer receiving emails");
            condition.notifyAll();
        } finally {
            lock.unlock();
        }
    }
}
