package br.com.abc.introducao.controlefluxo;// imprimir todos os números pares de 0 a 100.000

public class ExercicioControleDeFluxo3 {
    public static void main(String[] args) {
        int valor = 1000000;
        for ( int i = 1; i <= valor; i++ ) {
            if ( i % 2 == 0 )
                System.out.println(i);

        }
    }
}
