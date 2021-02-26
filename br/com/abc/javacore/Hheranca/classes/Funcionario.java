package br.com.abc.javacore.Hheranca.classes;

public class Funcionario extends Pessoa {

    private double salario;

    {
        System.out.println("Bloco de inicialização de FUNCIONÁRIO 1");
    }

    {
        System.out.println("Bloco de inicialização de FUNCIONÁRIO 2");
    }

    static {
        System.out.println("Bloco de inicialização static FUNCIONÁRIO 1");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de FUNCIONÁRIO");
    }

    public void imprime() {
        super.imprime();
        System.out.println("salário: " + this.salario);
        imprimeReciboPagamento();
    }

    public void imprimeReciboPagamento() {
        System.out.println("Eu, " + super.nome + ", recebi o pagamento de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
