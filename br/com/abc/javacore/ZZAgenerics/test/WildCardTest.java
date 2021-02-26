package br.com.abc.javacore.ZZAgenerics.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class Animal {
    public abstract void consulta();
}

class Cachorro extends Animal implements Comparable {

    @Override
    public void consulta() {
        System.out.println("Consultando Cachorro");

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

class Gato extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando Gato");

    }
}

public class WildCardTest {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};
//        consultarAnimais(cachorros);
//        consultarAnimais(gatos);
        List<Cachorro> cachorroList = new ArrayList<>();
        cachorroList.add(new Cachorro());
        List<Gato> gatoList = new ArrayList<>();
        gatoList.add(new Gato());

        cunsultarAnimaisList(cachorroList);
        cunsultarAnimaisList(gatoList);
        ordenarLista(cachorroList);


    }
    public static void consultarAnimais(Animal[] animals){
        for (Animal animal : animals) {
            animal.consulta();
        }
//        animals[1] = new Gato();
    }

    // type erasure | ?
    public static void cunsultarAnimaisList(List<? extends Animal> animals){
        for (Animal animal : animals) {
            animal.consulta();
        }
    }
    public static void consultarCachorroList(List<? super Cachorro> cachorroList){
        Cachorro c1 = new Cachorro();
        Animal c2 = new Cachorro();
        Object c = new Cachorro();
        cachorroList.add(new Cachorro());
    }

    public static void ordenarLista(List<? extends Comparable> lista){
        Collections.sort(lista);
    }
}
