package academy.devdojo.maratona.javacore.Kenum.domain;

public enum TypePayment {
    CREDIT_CARD {
        @Override
        public double calculateDiscount(double value) {
            return value * 0.1;
        }
    },
    DEBIT_CARD {
        @Override
        public double calculateDiscount(double value) {
            return value * 0.05;
        }
    };

    public abstract double calculateDiscount(double value);
}