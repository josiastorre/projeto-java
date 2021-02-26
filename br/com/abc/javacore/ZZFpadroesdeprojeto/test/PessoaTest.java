package br.com.abc.javacore.ZZFpadroesdeprojeto.test;

import br.com.abc.javacore.ZZFpadroesdeprojeto.classes.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa.PessoaBuilder("Josias")
                .ultimoNome("Pinto")
                .nomeDoMeio("Leite")
                .apelido("vagabundo")
                .nomeDaMae("Miriam")
                .build();
        System.out.println(p);
    }
}
