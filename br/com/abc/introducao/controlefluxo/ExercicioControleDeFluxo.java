package br.com.abc.introducao.controlefluxo;

/*
Criar uma tabela SALÁRIO
Com IMPOSTO
sALARIO < 1000 5%
Salario >= 1000 && Salário < 2000 imposto de 10%
Salario >= 2000 && Salário < 4000 imposto de 15%
Salario >= 5000 imposto de 20%
 */
public class ExercicioControleDeFluxo {
    public static void main(String[] args) {
        double salario = 900;
        double totalImposto = 0;
        if (salario < 1000.00) {
            totalImposto = salario * 0.05;
        } else if (salario >= 1000.00 && salario <= 2000.00) {
            totalImposto = salario * 0.1;
        } else if (salario >= 2000.00 && salario <= 2000.00) {
            totalImposto = salario * 0.15;
        } else {
            totalImposto = salario * 0.20;
        }
        System.out.println("O total de imposto é: "+totalImposto );
    }
}
