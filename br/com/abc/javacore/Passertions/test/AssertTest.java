package br.com.abc.javacore.Passertions.test;

public class AssertTest {
    public static void main(String[] args) {
        diasDaSemamna(2);
    }

    private static void calculaSalario(double salario){
        assert salario > 0;
        // calculo do salario

    }

    public static void diasDaSemamna(int dia){
        switch (dia) {
            case 1:break;
            case 2:break;
            case 3:break;
            case 4:break;
            case 5:break;
            case 6:break;
            case 7:break;
            default: assert false;

        }
    }
}
