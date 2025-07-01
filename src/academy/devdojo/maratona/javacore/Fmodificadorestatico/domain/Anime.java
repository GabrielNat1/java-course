package academy.devdojo.maratona.javacore.Fmodificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 0 - block initialization and executed when the JVM loading class
    // 1 - memory allocation for object
    // 2 - default values
    // 3 - boot block
    // 4 - constructor initialized

    static {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("bloco estatico 2");
    }

    static{
        System.out.println("bloco estatico 3");
    }

    {
        System.out.println("bloco nao estatico");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int episodio : Anime.episodios) {
            System.out.println(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
