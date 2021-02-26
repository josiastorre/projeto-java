package br.com.abc.introducao.operadores;

public class Operadores {
    public static void main(String[] args) {
        int numeroInteiro = 20;
        long numeroLong = 2000000L;

        double numeroDouble = 10D;
        float numeroFloat = 20F;
        numeroFloat = (float) numeroDouble;
        int resto = 20%2;
        System.out.println("resto da divisão: "+ resto);
        System.out.println(numeroDouble);
    }
}
