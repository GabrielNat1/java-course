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

    public int divide02(double num1, double num2){
        if (num2 != 0){
            return (int) (num1/num2);
        }
        return 0;
    }

    public void imprimedivisao(double num1, double num2){
        if (num2 == 0){
            System.out.println("não existe divisão por zero");
            return;
        }

        System.out.println(num1 / num2);
    }

    public void alteradoisnumeros(int numero1, int numero2){
        numero2 = 50;
        numero1 = 20;
        System.out.println("\n----------------------");
        System.out.println("dentro do altera dois numeros");
        System.out.println("num1: "+numero1);
        System.out.println("num2 "+numero2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num: numeros){
            suma += num;
            System.out.println(soma);
        }
    }
}
