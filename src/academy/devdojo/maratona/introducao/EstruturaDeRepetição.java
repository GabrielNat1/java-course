package academy.devdojo.maratona.introducao;

public class EstruturaDeRepetição {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while(count < 10){
            System.out.println(count++);
        }

        count = 0;
        do {
            System.out.println("teste" + ++count);
        } while(count < 10);

        for (int i=0 ; i < 10 ; i++){
            System.out.println(i);
        }
    }
}
