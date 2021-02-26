package br.com.abc.javacore.ZZEconcorrencias.classes;

public class ContaConco {
    private int saldo = 50;

    public int getSaldo() {
        return saldo;
    }

    public void saque(int valor) {
        saldo = saldo - valor;
    }
}
