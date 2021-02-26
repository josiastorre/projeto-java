package br.com.abc.javacore.Bintroducaometodos.test;

import br.com.abc.javacore.Bintroducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.nome = "Fraklin D Roosevelt";
        prof.materia = "Física";
        prof.matricula = "15647E";
        prof.registroGeral = "4.698.656";

        Professor prof2 = new Professor();
        prof2.nome = "Harry Trumam";
        prof2.materia = "Física-Teórica";
        prof2.matricula = "89547D";
        prof2.registroGeral = "3.547.665";



        prof.imprime();


        prof2.imprime();


    }
}
