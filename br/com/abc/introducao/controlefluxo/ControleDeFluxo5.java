package br.com.abc.introducao.controlefluxo;// dado um valor de um carro, descubra em quantas vezes ele pode ser parfcelado
//porem as parcelas não podem ser menores que 1000

public class ControleDeFluxo5 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela "+parcela +" R$ "+valorParcela);
        }
    }
}
