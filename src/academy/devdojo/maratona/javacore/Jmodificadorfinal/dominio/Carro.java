package academy.devdojo.maratona.javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    private static final double VELOCIDADE_LIMITE = 240;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
