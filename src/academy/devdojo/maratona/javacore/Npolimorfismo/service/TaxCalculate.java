package academy.devdojo.maratona.javacore.Npolimorfismo.service;

import academy.devdojo.maratona.javacore.Npolimorfismo.domain.Desktop;
import academy.devdojo.maratona.javacore.Npolimorfismo.domain.Tomato;

public class TaxCalculate {
    public static void calculateTaxDesktop(Desktop desktop){
        System.out.println("--------------------------------------");
        System.out.println("computer tax report");
        double tax = desktop.CalculateTax();
        System.out.println("Tax for desktop " + desktop.getName());
        System.out.println("Value: " + tax);
        System.out.println("--------------------------------------");
    }

    public static void calculateTaxTomato(Tomato tomato){
        System.out.println("--------------------------------------");
        System.out.println("tomato tax report");
        double tax = tomato.CalculateTax();
        System.out.println("Tax for Tomato " + tomato.getName());
        System.out.println("Value: " + tax);
        System.out.println("--------------------------------------");
    }
}
