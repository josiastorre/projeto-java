package br.com.abc.javacore.Bintroducaometodos.test;


import br.com.abc.javacore.Bintroducaometodos.classes.ExercicioEstudante;

public class ExercicioEstudanteTes {
    public static void main(String[] args) {
        ExercicioEstudante estudante = new ExercicioEstudante();
        estudante.setNome("Josias Pinto");
        estudante.setIdade(-1);
        estudante.setNotas(new double[]{3,5,5});
        estudante.print();
        estudante.tirarMedia();
        System.out.println("Aprovado? "+estudante.isAprovado());
    }
}
