package academy.devdojo.maratona.javacore.Gassociation.domain;

public class Escola {
    private String nome;
    private Professor[] professores;

    public void imprime(){
        System.out.println(this.nome);
        if(professores == null) return;
        for (Professor professor : professores){
            System.out.println(professor.getNome());
        }
    }

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores){
        this.nome = nome;
        this.professores = professores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}