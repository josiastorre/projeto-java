package br.com.abc.javacore.Gassociacao.classes;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno() {
    }

    public void print() {
        System.out.println("------------------- Relatório de alunos -------------------------");

        System.out.println("nome: "+this.nome);
        System.out.println("idade: "+this.idade);
        if(this.seminario != null)
        System.out.println("Seminário inscrito: "+this.seminario.getTitulo());
        else
            System.out.println("Aluno não está inscrito em nenhum seminário");
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
