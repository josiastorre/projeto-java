package br.com.abc.javacore.Bintroducaometodos.test;

import br.com.abc.javacore.Bintroducaometodos.classes.Calculadora;


public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(5,7);
        System.out.println("Divisão de dois numeros");
        double result = calc.divideDoisNumeros(20,0) ;
        System.out.println(result);
        System.out.println("impirimindo dois numeros divididos");
        calc.imprimeDoisNumerosDivididos(20,0);
        System.out.println("Continuando a exec");

        int[] numeros = {1,2,3,4,5};
        calc.somaArray(numeros);
        calc.somaVarArgs(5d+5d+5d,5d,5d);
    }
}
