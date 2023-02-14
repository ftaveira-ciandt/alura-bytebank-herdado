public class Funcionario {

    private String nome;
    private String cpf;
    protected double salario;

    public double getBonificacao() {
        return this.salario *0.1;
    }


    public String getNome() {
        return nome;
    }

    public Funcionario setNome(final String nome) {
        this.nome = nome;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public Funcionario setCpf(final String cpf) {
        this.cpf = cpf;
        return this;
    }

    public double getSalario() {
        return salario;
    }

    public Funcionario setSalario(final double salario) {
        this.salario = salario;
        return this;
    }

}
