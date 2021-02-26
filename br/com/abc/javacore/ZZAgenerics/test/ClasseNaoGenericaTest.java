package br.com.abc.javacore.ZZAgenerics.test;

import br.com.abc.javacore.ZZAgenerics.classes.Carro;
import br.com.abc.javacore.ZZAgenerics.classes.Computador;

import java.util.ArrayList;
import java.util.List;

public class ClasseNaoGenericaTest {
    public static void main(String[] args) {
        CarroAlugavel carroAlugavel = new CarroAlugavel();
        Carro carroAlugado = carroAlugavel.getCarroDisponivel();
        System.out.println("Usando o carro por um mês");
        carroAlugavel.devolverCarro(carroAlugado);

        System.out.println("----------------------");
        ComputadorAlugavel computadorAlugavel = new ComputadorAlugavel();
        Computador computadorAlugado = computadorAlugavel.getComputadorDisponivel();
        System.out.println("Usando Computador por um mês");
        computadorAlugavel.devolverComputador(computadorAlugado);


    }
}

class CarroAlugavel {
    private List<Carro> carrosDisponiveis = new ArrayList<>();

    {
        carrosDisponiveis.add(new Carro("Gol"));
        carrosDisponiveis.add(new Carro("BMW"));
    }

    //Alugar
    public Carro getCarroDisponivel() {
        Carro c = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro: " + c);
        System.out.println("Carros disponiveis: " + carrosDisponiveis);

        return c;
    }

    public void devolverCarro(Carro c) {
        System.out.println("Devolvendo carro: " + c);
        carrosDisponiveis.add(c);
        System.out.println("Carros disponiveis: " + carrosDisponiveis);
    }
}

class ComputadorAlugavel {
    private List<Computador> computadoresDisponiveis = new ArrayList<>();

    {
        computadoresDisponiveis.add(new Computador("Allienware"));
        computadoresDisponiveis.add(new Computador("Dell"));
    }

    //Alugar
    public Computador getComputadorDisponivel() {
        Computador c = computadoresDisponiveis.remove(0);
        System.out.println("Alugando computador: " + c);
        System.out.println("Computadores disponiveis: " + computadoresDisponiveis);

        return c;
    }

    public void devolverComputador(Computador c) {
        System.out.println("Devolvendo computador: " + c);
        computadoresDisponiveis.add(c);
        System.out.println("Computadores disponiveis: " + computadoresDisponiveis);
    }
}