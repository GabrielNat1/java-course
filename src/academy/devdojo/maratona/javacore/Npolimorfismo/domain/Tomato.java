package academy.devdojo.maratona.javacore.Npolimorfismo.domain;

public class Tomato extends Product{
    public static final double TAX_RATE_PERCENT = 0.06;
    private String dateValidity;

    public Tomato(String name, double value) {
        super(name, value);
    }

    @Override
    public double CalculateTax() {
        System.out.println("Calculating tax for Tomato ...");
        return this.value * TAX_RATE_PERCENT;
    }

    public String getDateValidity() {
        return dateValidity;
    }

    public void setDateValidity(String dateValidity) {
        this.dateValidity = dateValidity;
    }
}
