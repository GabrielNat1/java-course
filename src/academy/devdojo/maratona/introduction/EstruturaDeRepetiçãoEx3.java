package academy.devdojo.maratona.introduction;

public class EstruturaDeRepetiçãoEx3 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        int parcela;
        for (parcela = 1; parcela < valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000) {
                System.out.println("Parcela " + parcela + " R$ " + valorParcela);
            } else {
                break;
            }
        }
        System.out.println("Fora do if, mas dentro do  " + parcela);
    }
}
