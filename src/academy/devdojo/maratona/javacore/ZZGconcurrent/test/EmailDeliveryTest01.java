package academy.devdojo.maratona.javacore.ZZGconcurrent.test;


import academy.devdojo.maratona.javacore.ZZGconcurrent.domain.Members;
import academy.devdojo.maratona.javacore.ZZGconcurrent.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread goku = new Thread(new EmailDeliveryService(members), "goku");
        Thread brolly = new Thread(new EmailDeliveryService(members), "brolly");

        goku.start();
        brolly.start();

        while (true){
            String email = JOptionPane.showInputDialog("enter your email");
            if (email == null || email.isEmpty()){
                members.close();
                break;
            }
            members.addMemberEmail(email);
        }
    }
}

