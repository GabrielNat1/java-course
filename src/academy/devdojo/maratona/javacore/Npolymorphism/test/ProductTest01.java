package academy.devdojo.maratona.javacore.Npolymorphism.test;

import academy.devdojo.maratona.javacore.Npolymorphism.domain.Desktop;
import academy.devdojo.maratona.javacore.Npolymorphism.domain.Television;
import academy.devdojo.maratona.javacore.Npolymorphism.domain.Tomato;
import academy.devdojo.maratona.javacore.Npolymorphism.service.TaxCalculate;

public class ProductTest01 {
    public static void main(String[] args) {
        Desktop desktop = new Desktop("Desktop Gamer", 5000);
        Tomato tomato = new Tomato("Tomato", 10);
        Television tv = new Television("Smart TV", 3000);

        TaxCalculate.calculateTax(desktop);
        TaxCalculate.calculateTax(tomato);
        TaxCalculate.calculateTax(tv);
    }
}
