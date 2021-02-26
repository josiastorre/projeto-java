package br.com.abc.javacore.ZZDthreads.test;

import br.com.abc.javacore.ZZDthreads.classes.Conta;

public class ContaTest implements Runnable {
    private Conta conta = new Conta();

    public static void main(String[] args) {
        ContaTest contaTest = new ContaTest();
        Thread josias = new Thread(contaTest, "Josias");
        Thread lais = new Thread(contaTest, "Lais");
        josias.start();
        lais.start();
    }

    public static void imprime() {
        synchronized (ContaTest.class){
            System.out.println("asasas");
        }
    }

    public void saque(int valor) {
        synchronized (conta) {
            if (conta.getSaldo() >= valor) {
                System.out.println(Thread.currentThread().getName() + " está indo sacar");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                conta.saque(valor);
                System.out.println(Thread.currentThread().getName() + " completou o saque: " + conta.getSaldo());
            } else {
                System.out.println("Sem dinheiro para " + Thread.currentThread().getName() + " efetuar o saque, saldo: " + conta.getSaldo());
//            conta.saque(valor);
            }
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            saque(10);
            if (conta.getSaldo() < 0) {
                System.out.println("oh meu Deus!");
            }
        }
    }
}
