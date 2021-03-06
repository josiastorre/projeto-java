package br.com.abc.javacore.ZZDthreads.classes;

import java.util.LinkedList;
import java.util.Queue;

public class LIstaMembros {
    private final Queue<String> emails = new LinkedList<>();
    private boolean aberta = true;

    public int getEmailsPendentes(){
        synchronized (emails){
            return this.emails.size();
        }
    }

    public boolean isAberta() {
        return aberta;
    }

    public String obterEmailMembro(){
        String email = null;
        try {
            synchronized (this.emails){
                while(this.emails.size() == 0){
                    if(!aberta) return null;
                    System.out.println("Lista vazia, colocando a Thread: "+Thread.currentThread().getName()+ " em modo Wait");
                    this.emails.wait();
                }
                email = this.emails.poll();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return email;
    }
    public void adicionarEmailMembro(String email){
        synchronized (this.emails){
            this.emails.add(email);
            System.out.println("Email adicionado na Lista");
            System.out.println("Notificando as Threads que estão em espera "+ Thread.currentThread().getName());
            this.emails.notifyAll();
        }
    }
    public void fecharLista(){
        System.out.println("Notificando todas as Threads e fechando a Lista");
        aberta = false;
        synchronized (this.emails){
            this.emails.notifyAll();
        }
    }
}
