package academy.devdojo.maratona.javacore.Hheranca.dominio;


public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Bloco de inicialização estático da classe Funcionario");
    }

    {
        System.out.println("Bloco de inicialização não estático da classe Funcionario");
    }

    public Funcionario(String nome) {
        super(nome);
    }

    public void imprime() {
        super.imprime();
        System.out.println("Salário: " + this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu, " + this.nome + ", recebo o salário de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
