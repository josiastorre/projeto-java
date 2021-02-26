package br.com.abc.introducao.controlefluxo;

public class ControleDeFluxo1 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade juvenil
        // idade >= 18 adulto
        int idade = 17;
        String categoria;
        if(idade <= 15) {
            categoria = "Infantil";
        }else if(idade >=15 &&  idade <18) {
            categoria = "Juvenil";
        }else{
            categoria = "Adulta";
        }
        System.out.println(categoria);
    }
}
