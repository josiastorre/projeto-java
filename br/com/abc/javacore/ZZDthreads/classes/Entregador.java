package br.com.abc.javacore.ZZDthreads.classes;

public class Entregador implements Runnable{
    private LIstaMembros lIstaMembros;

    public Entregador(LIstaMembros lIstaMembros) {
        this.lIstaMembros = lIstaMembros;
    }

    @Override
    public void run() {
        String nomeThread = Thread.currentThread().getName();
        System.out.println(nomeThread + " Começando o trabalho de entrega");
        int qtdePendente = lIstaMembros.getEmailsPendentes();
        boolean aberta = lIstaMembros.isAberta();
        while(aberta || qtdePendente > 0) {
            try {
                String email = lIstaMembros.obterEmailMembro();
                if (email != null) {
                    System.out.println(nomeThread + " Enviando email para "+email);
                    Thread.sleep(1000);
                    System.out.println("Envia para " + email + " concluído com sucesso");
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            aberta = lIstaMembros.isAberta();
            qtdePendente  = lIstaMembros.getEmailsPendentes();
        }
        System.out.println("Atividades finalizadas");
    }
}
