package br.com.abc.javacore.ZZEconcorrencias.classes;

import javax.swing.*;

public class EntregadorConcoTest {
    public static void main(String[] args) {
        LIstaConcoMembros lIstaConcoMembros = new LIstaConcoMembros();
        Thread t1 = new Thread(new EntregadorConco(lIstaConcoMembros), "Entregador 1");
        Thread t2 = new Thread(new EntregadorConco(lIstaConcoMembros), "Entregador 2");
        t1.start();
        t2.start();
        while (true){
            String email = JOptionPane.showInputDialog("Digite o email do membro");
            if (email == null || email.isEmpty()){
                lIstaConcoMembros.fecharLista();
                break;
            }
            lIstaConcoMembros.adicionarEmailMembro(email);
        }
    }
}
