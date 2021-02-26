package br.com.abc.javacore.ZZCjdbc.test;

import br.com.abc.javacore.ZZCjdbc.classes.Carro;
import br.com.abc.javacore.ZZCjdbc.classes.Comprador;
import br.com.abc.javacore.ZZCjdbc.db.CarroDAOImpl;
import br.com.abc.javacore.ZZCjdbc.db.CarroDAOImplNoSQL;
import br.com.abc.javacore.ZZCjdbc.interfaces.CarroDAO;

import java.util.List;
import java.util.Scanner;

public class CarroCRUD {
    private static Scanner teclado = new Scanner(System.in);
    private static CarroDAO dao = new CarroDAOImplNoSQL();

    public static void executarCarro(int op) {
        switch (op) {
            case 1:
                inserirCarro();
                break;
            case 2:
                atualizarCarro();
                break;
            case 3:
                listarCarro();
                break;
            case 4:
                System.out.println("Digite o nome");
                buscarPorNomeCarro(teclado.nextLine());
                break;
            case 5:
                deletarCarro();
                break;
        }
    }

    private static void inserirCarro() {
        Carro c = new Carro();
        System.out.println("Nome: ");
        c.setNome(teclado.nextLine());
        System.out.println("Placa: ");
        c.setPlaca(teclado.nextLine());
        System.out.println("Selecione um dos compradores abaixo");
        List<Comprador> compradorList = CompradorCRUD.listar();
        c.setComprador(compradorList.get(Integer.parseInt(teclado.nextLine())));
        dao.saveCarro(c);
    }

    private static void atualizarCarro() {
        System.out.println("Selecione um dos carros abaixo");
        List<Carro> carroList = listarCarro();
        Carro c = carroList.get(Integer.parseInt(teclado.nextLine()));
        System.out.println("Novo nome ou Enter para manter o mesmo");
        String nome = teclado.nextLine();
        System.out.println("Nova placa ou Enter para manter o mesmo");
        String placa = teclado.nextLine();
        if (!nome.isEmpty()) {
            c.setNome(nome);
        }
        if (!placa.isEmpty()) {
            c.setPlaca(placa);
        }
        dao.updateCarro(c);
    }

    private static List<Carro> listarCarro() {
        List<Carro> carroList = dao.selectAllCarro();
        for (int i = 0; i < carroList.size(); i++) {
            Carro c = carroList.get(i);
            System.out.println("[" + i + "] " + c.getNome() + " " + c.getPlaca() + " " +c.getComprador().getNome());
        }
        return carroList;
    }

    private static void buscarPorNomeCarro(String nome) {
        List<Carro> carroList = dao.searchByNameCarro(nome);
        for (int i = 0; i < carroList.size(); i++) {
            Carro c = carroList.get(i);
            System.out.println("[" + i + "] " + c.getNome() + " " + c.getPlaca() + " " +c.getComprador().getNome());
        }
    }

    public static void deletarCarro() {
        System.out.println("Selecione um dos carros abaixo para deletar");
        List<Carro> carroList = listarCarro();
        int index = Integer.parseInt(teclado.nextLine());
        System.out.println("Tem certeza? S/N");
        String op = teclado.nextLine();
        if (op.startsWith("s")) {
            dao.deleteCarro(carroList.get(index));
        }
    }
}
