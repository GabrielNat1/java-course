package academy.devdojo.maratona.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String tipo;
    private int episodios;

    public void imprime(){
        System.out.println(this.tipo);
        System.out.println(this.episodios);
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }

    public int getEpisodios(){
        return this.episodios;
    }
}
