package academy.devdojo.maratona.javacore.Hheranca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Bloco de inicialização estático da classe Pessoa");
    }

    {
        System.out.println("Bloco de inicialização não estático da classe Pessoa");
    }

    public Pessoa(String nome){
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        if (this.endereco != null) {
            System.out.println("Rua: " + this.endereco.getRua());
            System.out.println("CEP: " + this.endereco.getCep());
        } else {
            System.out.println("Endereço não informado.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
