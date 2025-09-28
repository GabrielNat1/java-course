package academy.devdojo.maratona.javacore.Npolymorphism.test;

import academy.devdojo.maratona.javacore.Npolymorphism.domain.Desktop;
import academy.devdojo.maratona.javacore.Npolymorphism.domain.Product;
import academy.devdojo.maratona.javacore.Npolymorphism.domain.Tomato;
import academy.devdojo.maratona.javacore.Npolymorphism.service.TaxCalculate;

public class ProductTest03 {
    public static void main(String[] args) {
        Product product = new Desktop("Desktop Gamer", 5000);
        Tomato tomato = new Tomato("Tomato", 10);
        tomato.setDateValidity("2024-12-31");

        TaxCalculate.calculateTax(tomato);
    }
}
