package br.com.abc.javacore.Aintroducaoclasses.test;

import br.com.abc.javacore.Aintroducaoclasses.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante joao = new Estudante();
        joao.nome = "João";
        joao.matricula = "1212";
        joao.idade = 15;
        System.out.println("Nome do Estudante: "+ joao.nome);
        System.out.println("Matrícula do Estudade: "+ joao.matricula);
        System.out.println("Idade do Estudante: "+ joao.idade);
    }
}
