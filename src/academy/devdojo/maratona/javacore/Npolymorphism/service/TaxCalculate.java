package academy.devdojo.maratona.javacore.Npolymorphism.service;

import academy.devdojo.maratona.javacore.Npolymorphism.domain.Product;
import academy.devdojo.maratona.javacore.Npolymorphism.domain.Tomato;

public class TaxCalculate {
    public static void calculateTax(Product product){
        System.out.println("Relatory tax report");
        double tax = product.CalculateTax();
        System.out.println("Product: " + product.getName());
        System.out.println("Value: " + product.getValue());
        System.out.println("Tax: " + tax);

        if(product instanceof Tomato){
            String date = ((Tomato) product).getDateValidity();
            System.out.println(date);
        }

    }
}
