package academy.devdojo.maratona.introduction;

public class EstruturaDeRepetiçãoEx2 {
    public static void main(String[] args) {
        int ValorMax = 50;
        for (int i = 0; i <= ValorMax; i++) {
            if(i > 25) {
                break;
            }
            System.out.println("i: " +i);
        }
    }
}
