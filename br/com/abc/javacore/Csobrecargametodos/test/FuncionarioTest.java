package br.com.abc.javacore.Csobrecargametodos.test;

import br.com.abc.javacore.Csobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Chica da Silva","223.221.222-45",4500, "45698756");
        Funcionario funcionario2 = new Funcionario();

        funcionario.imprime();
        System.out.println("-----------------");
        funcionario2.imprime();
    }
}
