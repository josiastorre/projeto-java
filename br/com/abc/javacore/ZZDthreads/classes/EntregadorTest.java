package br.com.abc.javacore.ZZDthreads.classes;

import javax.swing.*;

public class EntregadorTest {
    public static void main(String[] args) {
        LIstaMembros lIstaMembros = new LIstaMembros();
        Thread t1 = new Thread(new Entregador(lIstaMembros), "Entregador 1");
        Thread t2 = new Thread(new Entregador(lIstaMembros), "Entregador 2");
        t1.start();
        t2.start();
        while (true){
            String email = JOptionPane.showInputDialog("Digite o email do membro");
            if (email == null || email.isEmpty()){
                lIstaMembros.fecharLista();
                break;
            }
            lIstaMembros.adicionarEmailMembro(email);
        }
    }
}
