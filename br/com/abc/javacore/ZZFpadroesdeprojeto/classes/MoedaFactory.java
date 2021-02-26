package br.com.abc.javacore.ZZFpadroesdeprojeto.classes;

public class MoedaFactory {
    public static Moeda criarMoeda(Pais pais) {
        if (pais.equals(Pais.BRASIL)){
            return new Real();
        }else if (pais.equals(Pais.EUA)){
            return new USDolar();
        }
        throw new IllegalArgumentException("Não existe esse país");

    }

}
