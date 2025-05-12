package academy.devdojo.maratona.introducao;

public class EstruturaDeRepetiçãoEx1 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println("----------------");
                System.out.println("Number par:" + i);
            }
        }
        System.out.println("system finality");
    }
}