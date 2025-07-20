package academy.devdojo.maratona.javacore.Npolimorfismo.service;

import academy.devdojo.maratona.javacore.Npolimorfismo.domain.Desktop;
import academy.devdojo.maratona.javacore.Npolimorfismo.domain.Product;
import academy.devdojo.maratona.javacore.Npolimorfismo.domain.Tomato;

public class TaxCalculate {
    public static void calculateTax(Product product){
        System.out.println("Relatory tax report");
        double tax = product.CalculateTax();
        System.out.println("Product: " + product.getName());
        System.out.println("Value: " + product.getValue());
        System.out.println("Tax: " + tax);
    }
}
