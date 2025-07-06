package academy.devdojo.maratona.javacore.Gassociacao.domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("----------");
        System.out.println("Professor: " + this.nome);

        if (seminarios == null || seminarios.length == 0) {
            System.out.println("Nenhum seminário cadastrado.");
            return;
        }

        System.out.println("Seminários cadastrados:");
        int i = 1;

        for (Seminario seminario : this.seminarios) {
            System.out.println("Seminário " + i + ": " + seminario.getTitulo());

            if (seminario.getLocal() != null) {
                System.out.println("Local: " + seminario.getLocal().getEndereço());
            } else {
                System.out.println("Local: Não informado.");
            }

            Aluno[] alunos = seminario.getAlunos();
            if (alunos != null && alunos.length > 0) {
                System.out.println("** Alunos **");
                for (Aluno aluno : alunos) {
                    System.out.println("- Nome: " + aluno.getNome() + ", Idade: " + aluno.getIdade());
                }
            } else {
                System.out.println("Nenhum aluno inscrito.");
            }

            i++;
            System.out.println();
        }
    }


    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}