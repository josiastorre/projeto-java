package br.com.abc.javacore.ZZBclassesinternas.test;

import br.com.abc.javacore.ZZAgenerics.classes.Carro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Animal {
    public void andar() {
        System.out.println("Andando");
    }
}

public class ClassesAnonimasTest {
    public static void main(String[] args) {
        Animal a = new Animal() {
            public void andar() {
                System.out.println("Andando anonimamente");
            }
            public void comer() {
                System.out.println("comendo");
            }
        };
        a.andar();

        List<Carro> carroList = new ArrayList<>();
        carroList.add(new Carro("BMW"));
        carroList.add(new Carro("Audi"));
        Collections.sort(carroList, new Comparator<Carro>() {
            @Override
            public int compare(Carro o1, Carro o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
        //        Collections.sort(carroList, (o1, o2) -> o1.getNome().compareTo(o2.getNome())); // versão Lambda

        System.out.println(carroList);
        long start = System.currentTimeMillis();
        long fim = System.currentTimeMillis();
        System.out.println(fim - start);
    }
}