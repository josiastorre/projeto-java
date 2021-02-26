package br.com.abc.introducao.controlefluxo;

public class ControleDeFluxo4 {
    public static void main(String[] args) {
        int contador = 0;
        while (contador < 10) {
            System.out.println(++contador);
        }
        contador = 0;
        do {
            System.out.println("dentro do do while: " + contador++);
        } while (contador < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("valor de i é: " + i);
            if(i==5) {
                break;
            }
        }
    }
}
