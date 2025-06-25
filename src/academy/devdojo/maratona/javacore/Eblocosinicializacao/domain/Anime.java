package academy.devdojo.maratona.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;
    // 1 - memory allocation for object
    // 2 - default values
    // 3 - boot block
    // 4 - constructor initialized

    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int episodio : this.episodios) {
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
