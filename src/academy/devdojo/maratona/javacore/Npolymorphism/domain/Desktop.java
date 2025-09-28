package academy.devdojo.maratona.javacore.Npolymorphism.domain;

public class Desktop extends Product{
    public static final double TAX_RATE_PERCENT = 0.21;

    public Desktop(String name, double value) {
        super(name, value);
    }

    @Override
    public double CalculateTax() {
        System.out.println("Calculating tax for Desktop ...");
        return this.value * TAX_RATE_PERCENT;
    }
}
