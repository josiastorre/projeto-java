package br.com.abc.javacore.Zcolecoes.test;

import br.com.abc.javacore.Zcolecoes.classes.Consumidor;
import br.com.abc.javacore.Zcolecoes.classes.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumidorMapTest {
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Josias Pinto", "121");
        Consumidor consumidor2 = new Consumidor("DevDojo", "311");
        Consumidor consumidor3 = new Consumidor("Iraci Pinto", "2511");

        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.0);
        Produto produto2 = new Produto("321", "Picanha", 26.4);
        Produto produto3 = new Produto("879", "Teclado Razer", 1000.0);
        Produto produto4 = new Produto("012", "Samsung Galaxy S7 64Gb", 3250.5);

        Map<Consumidor, List<Produto>> map = new HashMap<>();

        List<Produto> produtosCon1 = new ArrayList<>();
        produtosCon1.add(produto1);
        produtosCon1.add(produto2);
        List<Produto> produtosCon2 = new ArrayList<>();
        produtosCon2.add(produto3);
        produtosCon2.add(produto4);
        List<Produto> produtosCon3 = new ArrayList<>();
        produtosCon3.add(produto2);
        produtosCon3.add(produto4);

        map.put(consumidor, produtosCon1);
        map.put(consumidor2, produtosCon2);
        map.put(consumidor3, produtosCon3);
        for (Map.Entry<Consumidor,List<Produto>> entry : map.entrySet()){
            System.out.println("Nome do cliente: "+ entry.getKey().getNome() +
                    " - nº de cliente: "+ entry.getKey().getCpf());
            for (Produto produto : entry.getValue()) {
                System.out.println("produtos comprados: "+produto.getNome());

            }
            System.out.println("\n'LOJAS AMERICANAS' AGRADECE A PREFERÊNCIA!\n");
        }


    }
}
