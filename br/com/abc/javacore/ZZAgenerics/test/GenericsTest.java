package br.com.abc.javacore.ZZAgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
    public static void main(String[] args) {
        // type erasure
        List<String> lista = new ArrayList<>();
        lista.add("String");
        lista.add("String");
        lista.add("Josias Pinto");

        for (String obj : lista) {
            System.out.println(obj);
        }
        add(lista, 1L);


    }
    public static void add(List lista, Long l){
        lista.add(l);
    }
}
