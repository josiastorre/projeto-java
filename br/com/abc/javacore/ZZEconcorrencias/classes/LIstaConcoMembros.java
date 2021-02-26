package br.com.abc.javacore.ZZEconcorrencias.classes;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class LIstaConcoMembros {
    private final Queue<String> emails = new LinkedList<>();
    private ReentrantLock lock = new ReentrantLock();
    private final Condition conditioLock = lock.newCondition();

    private boolean aberta = true;

    public int getEmailsPendentes(){
        lock.lock();
        try {
            return this.emails.size();
        }finally {
            lock.unlock();
        }
    }

    public boolean isAberta() {
        return aberta;
    }

    public String obterEmailMembro(){
        String email = null;
        try {
            lock.lock();
                while(this.emails.size() == 0){
                    if(!aberta) return null;
                    System.out.println("Lista vazia, colocando a Thread "+Thread.currentThread().getName()+ " em modo Wait");
                    conditioLock.await();
                }
                email = this.emails.poll();
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
        return email;
    }
    public void adicionarEmailMembro(String email){
        lock.lock();
        try{
            this.emails.add(email);
            System.out.println("Email adicionado na Lista");
            System.out.println("Notificando as Threads que estão em espera "+ Thread.currentThread().getName());
            conditioLock.signalAll();
        }finally {
            lock.unlock();
        }
    }
    public void fecharLista(){
        System.out.println("Notificando todas as Threads e fechando a Lista");
        aberta = false;
        try {
            this.emails.notifyAll();
        }finally {
            lock.unlock();
        }
    }
}
