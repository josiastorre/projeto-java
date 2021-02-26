package br.com.abc.javacore.Aintroducaoclasses.test;

import br.com.abc.javacore.Aintroducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.nome = "Paulo Almeida";
        prof.matricula = "65320";
        prof.rg = "42.213.570-7";
        prof.cpf = "424.213.570-70";

        Professor prof2 = new Professor();
        prof2.nome = "George Washington";
        prof2.matricula = "96587";
        prof2.rg = "34.569.987-0";
        prof2.cpf = "445.689.568-09";

        prof = prof2;

        System.out.println("Nome do Professor: "+prof.nome);
        System.out.println("Matrícula do Professor: "+prof.matricula);
        System.out.println("RG do Professor: "+prof.rg);
        System.out.println("CPF do Professor: "+prof.cpf);
        System.out.println("---------------------------------------");
        System.out.println("Nome do Professor: "+prof2.nome);
        System.out.println("Matrícula do Professor: "+prof2.matricula);
        System.out.println("RG do Professor: "+prof2.rg);
        System.out.println("CPF do Professor: "+prof2.cpf);
    }
}
