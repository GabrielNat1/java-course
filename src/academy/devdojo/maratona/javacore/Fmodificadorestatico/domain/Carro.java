package academy.devdojo.maratona.javacore.Fmodificadorestatico.domain;

public class Carro {
    private String nome;
    private double veloxidadeMaxima;
    public static double velocidadeLimite = 250;

    public Carro(String nome, double veloxidadeMaxima) {
        this.nome = nome;
        this.veloxidadeMaxima = veloxidadeMaxima;
    }

    public void imprime(){
        System.out.println("---------------");
        System.out.println("nome: "+this.nome);
        System.out.println("velocidade maxima: "+ this.veloxidadeMaxima);
        System.out.println("velocidade limite: "+ Carro.velocidadeLimite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVeloxidadeMaxima() {
        return veloxidadeMaxima;
    }

    public void setVeloxidadeMaxima(double veloxidadeMaxima) {
        this.veloxidadeMaxima = veloxidadeMaxima;
    }
}
