package academy.devdojo.maratona.javacore.Npolymorphism.test;

import academy.devdojo.maratona.javacore.Npolymorphism.domain.Desktop;
import academy.devdojo.maratona.javacore.Npolymorphism.domain.Product;

public class ProductTest02 {
    public static void main(String[] args) {
        Product product = new Desktop("Desktop Gamer", 5000);
        System.out.println(product.getName());
        System.out.println(product.getValue());
        System.out.println(product.CalculateTax());
    }
}
