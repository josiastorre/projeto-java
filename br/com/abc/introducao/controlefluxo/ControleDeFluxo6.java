package br.com.abc.introducao.controlefluxo;// dado um valor de um carro, descubra em quantas vezes ele pode ser parfcelado
//porem as parcelas não podem ser menores que 1000

public class ControleDeFluxo6 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela <= 1000) {
                continue;
            }
            System.out.println("parcela " + parcela + " R$" + valorParcela);
            System.out.println("código consumindo memória");
        }

    }
}
