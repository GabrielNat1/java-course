package academy.devdojo.maratona.javacore.ZZFthreads.test;

import academy.devdojo.maratona.javacore.ZZFthreads.domain.Account;

public class ThreadAccountTest01 implements Runnable {
    private final Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "a");
        Thread t2 = new Thread(threadAccountTest01, "b");

        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (account.getBalance() < 0){
                System.out.println("F");
            }
        }
    }

    private void withdrawal(int amount){
        System.out.println(getThreadName() + " ############## not synchronized");
        synchronized (account) {
            System.out.println(getThreadName() + " ******** synchronized");
            if (account.getBalance() >= amount){
                System.out.println(getThreadName() + " withdrawal money");
                account.withdrawal(amount);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(getThreadName() + "value in balance: " + account.getBalance());
            } else {
                System.out.println("without money " + getThreadName());
            }
        }
    }

    private String getThreadName(){
        return Thread.currentThread().getName();
    }

}
