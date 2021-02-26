package br.com.abc.javacore.ZZCjdbc.test;

import br.com.abc.javacore.ZZCjdbc.classes.Comprador;
import br.com.abc.javacore.ZZCjdbc.db.CompradorDBOLD;

import java.sql.SQLException;
import java.util.List;

public class TesteConexao {
    public static void main(String[] args) {
//        inserir();
//        deletar();
//        atualizar();
//        selecionarTudo();
//        System.out.println(selecionarTudo());
//        List<Comprador> listaComprador = selecionarTudo();
//        List<Comprador> listaComprador2 = buscarPorNome("pires");
//        System.out.println(listaComprador);
//        System.out.println(listaComprador2);
//        CompradorDB.selectMetaData();
//        CompradorDB.checkDriverStatus();
//        CompradorDB.testTypeScroll();
//        CompradorDB.updateNomesToLowerCase();
//        System.out.println(CompradorDB.searchByNamePreparedStatement("ia"));
//        CompradorDB.updatePreparedStatement(new Comprador(1,"011.011.011-01","Prepared Statement da Silva"));
//        System.out.println(CompradorDB.searchByNameCallableStatement("%ia%"));
//        System.out.println(CompradorDB.searchByNameRowSet("ia"));
//        CompradorDB.updateRowSet(new Comprador(1,"011.011.011-01","Prepared Statement da Silva"));
//        CompradorDB.updateRowSetCached(new Comprador(1,"011.011.011-01","Prepared Statement da Silva"));
        try {
            CompradorDBOLD.saveTransaction();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    public static void inserir() {
        Comprador comprador = new Comprador("556.661.225-55", "ANA SOFYA");
        CompradorDBOLD.save(comprador);

    }


    public static void deletar() {
        Comprador comprador = new Comprador();
        comprador.setId(9);
        CompradorDBOLD.delete(comprador);
    }

    public static void atualizar() {
        Comprador comprador = new Comprador(6, "444.555.668-96", "DORCAS SILVEIRA");
        CompradorDBOLD.update(comprador);

    }


    public static List<Comprador> selecionarTudo() {
        return CompradorDBOLD.selectAll();
    }

    public static List<Comprador> buscarPorNome(String nome) {
        return CompradorDBOLD.searchByName(nome);
    }
}
