package br.com.abc.javacore.Fmodificadorestatico.classes;

public class Cliente {
    // 1- Bloco de inicialização estático é executado quando JVM carregar a classe (é executado apenas 1 vez)
    // 2 - Alocado espaço na memória para o objeto que será criado
    // 3 - Cada atributo de classe é criado e inicializado com seus valores default ou valores explícitos
    // 4 - Bloco de inicialização é executado
    // 5 - O construtor é executado

    private static int[] parcelas;

    static {
        parcelas = new int[100];
        System.out.println("dentro do bloco de inicialização estatico");
        for(int i=1; i<=100;i++){
            parcelas[i-1] = i;
        }
    }

    public Cliente() {
    }


    public static  int[] getParcelas() {
        return parcelas;
    }


}
