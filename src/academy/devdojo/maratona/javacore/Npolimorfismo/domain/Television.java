package academy.devdojo.maratona.javacore.Npolimorfismo.domain;

public class Television extends Product{
    public static final double TAX_RATE_PERCENT = 0.21;

    public Television(String name, double value) {
        super(name, value);
    }

    @Override
    public double CalculateTax() {
        System.out.println("Calculating tax for Television ...");
        return this.value * TAX_RATE_PERCENT;
    }
}
