package academy.devdojo.maratona.introduction;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        String name = "gabriel";
        int age = 20;
        boolean buy_drink;

        if (age >= 18){
            buy_drink = true;
        } else {
            buy_drink = false;
        }

        if( buy_drink == true){
            System.out.println("o usuario "+name+" que tem "+ age+" anos");
            System.out.println("é permitido comprar bebidas");
        } else {
            System.out.println("o usuario "+name+" que tem "+age+" anos");
            System.out.println("não e permitido comprar bebidas");
        }

        System.out.println("                  ");
        System.out.println("Sistema finalizado");
    }
}