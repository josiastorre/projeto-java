package br.com.abc.introducao.controlefluxo;/*
Exercicio de SWITCH de um valor de 1 a 7
Considerando 1 domingo imprima se é dia útil ou final de semana
 */

public class ExercicioControleDeFluxo2 {
    public static void main(String[] args) {
        byte dia = 5;
        // char, int, byte, short, enum, String
        switch (dia) {
            case 1:
            case 7:
                System.out.println("final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia útil");
                break;
            default:
                System.out.println("Opção invalida");
        }
    }
}
