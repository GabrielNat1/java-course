package academy.devdojo.maratona.javacore.Ycolections.test;

import academy.devdojo.maratona.javacore.Ycolections.domain.SmartPhone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone("32c1321", "iphone");
        SmartPhone s2 = new SmartPhone("163e21", "samsung");
        SmartPhone s3 = new SmartPhone("423q3", "pixel");

        List<SmartPhone> smartPhones = new ArrayList<>(6);
        smartPhones.add(s1);
        smartPhones.add(s2);
        smartPhones.add(0, s3);

        for (SmartPhone smartPhone : smartPhones){
            System.out.println(smartPhone);
        }

        SmartPhone s4 = new SmartPhone("423q3", "pixel");

        smartPhones.contains(s4);
        int indexSmartphone4 = smartPhones.indexOf(s4);
        System.out.println(smartPhones.get(indexSmartphone4));
    }
}
