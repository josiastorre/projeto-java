package br.com.abc.javacore.Bintroducaometodos.classes;

public class Professor {
    public String nome;
    public String matricula;
    public String materia;
    public String registroGeral;

    public void imprime() {
        System.out.println("----------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Matéria: " + this.materia);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("RG: " + this.registroGeral);

    }
}
