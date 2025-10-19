package academy.devdojo.maratona.javacore.ZZFthreads.service;

import academy.devdojo.maratona.javacore.ZZFthreads.domain.Members;

public class EmailDeliveryService implements Runnable{
    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " starting to deliver emails..");

        while (members.isOpen() || members.pendingEmails() > 0){
            try {
                String email = members.retrieveEmail();
                if (email == null) continue;
                System.out.println(threadName + " send email for " + email);
                Thread.sleep(2000);

                System.out.println(threadName + " sending email with success for " + email);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("everyone emails were sending with success!");
    }
}
