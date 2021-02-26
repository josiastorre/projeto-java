package br.com.abc.javacore.Hheranca.test;

import br.com.abc.javacore.Hheranca.classes.Endereco;
import br.com.abc.javacore.Hheranca.classes.Funcionario;
import br.com.abc.javacore.Hheranca.classes.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
//        Pessoa p = new Pessoa("Gina");
        Endereco end = new Endereco();
//        p.setCpf("12345");
//        end.setBairro("Bairro 1");
        end.setRua("Rua 25");
//        p.setEndereco(end);
//        p.imprime();
        System.out.println("----------------------------");
        Funcionario f = new Funcionario("Josias");
        f.setCpf("45123548");
        f.setSalario(3200);
        f.setEndereco(end);
//        f.imprime();
    }
}
