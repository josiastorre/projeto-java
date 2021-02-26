package br.com.abc.javacore.ZZEconcorrencias.classes;

public class EntregadorConco implements Runnable{
    private LIstaConcoMembros lIstaConcoMembros;

    public EntregadorConco(LIstaConcoMembros lIstaConcoMembros) {
        this.lIstaConcoMembros = lIstaConcoMembros;
    }

    @Override
    public void run() {
        String nomeThread = Thread.currentThread().getName();
        System.out.println(nomeThread + " Começando o trabalho de entrega");
        int qtdePendente = lIstaConcoMembros.getEmailsPendentes();
        boolean aberta = lIstaConcoMembros.isAberta();
        while(aberta || qtdePendente > 0) {
            try {
                String email = lIstaConcoMembros.obterEmailMembro();
                if (email != null) {
                    System.out.println(nomeThread + " Enviando email para "+email);
                    Thread.sleep(1000);
                    System.out.println("Envia para " + email + " concluído com sucesso");
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            aberta = lIstaConcoMembros.isAberta();
            qtdePendente  = lIstaConcoMembros.getEmailsPendentes();
        }
        System.out.println("Atividades finalizadas");
    }
}
