package br.com.abc.javacore.Jmodificadorfinal.test;

import br.com.abc.javacore.Jmodificadorfinal.classes.Carro;
import br.com.abc.javacore.Jmodificadorfinal.classes.Comprador;

public class CarroTest {
    public static void main(String[] args) {
        Carro c = new Carro();
        System.out.println(c.getCOMPRADOR());
        c.getCOMPRADOR().setNome("Kuririn");
        System.out.println(c.getCOMPRADOR());
    }
}
