package academy.devdojo.maratona.javacore.Npolimorfismo.test;

import academy.devdojo.maratona.javacore.Npolimorfismo.domain.Desktop;
import academy.devdojo.maratona.javacore.Npolimorfismo.domain.Tomato;
import academy.devdojo.maratona.javacore.Npolimorfismo.service.TaxCalculate;

public class ProductTest01 {
    public static void main(String[] args) {

        Desktop desktop = new Desktop("Desktop Gamer", 5000);
        Tomato tomato = new Tomato("Tomato", 10);

        TaxCalculate.calculateTaxDesktop(desktop);
        TaxCalculate.calculateTaxTomato(tomato);
    }
}
