package br.com.abc.introducao.controlefluxo;

public class ControleDeFluxo2 {
    public static void main(String[] args) {
        int idade= 14;
        String status;
        boolean ok = true;
        status = idade <18 ? "Não adulto" : "Adulto";
        System.out.println(status);
    }
}
