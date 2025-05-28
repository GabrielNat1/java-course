package academy.devdojo.maratona.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void soma(){
        System.out.println(10 + 10);
    }

    public void substrai(){
        System.out.println(20 - 1);
    }

    public void multiplica(int num1, float num2){
        System.out.println(num1 * num2);
    }

    public int divide(double num1, double num2){
        if (num2 != 0){
            return 0;
        }
        return (int) (num1/num2);
    }
}