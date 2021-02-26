package br.com.abc.javacore.Jmodificadorfinal.classes;

public class Carro {
    private static final double VELOCIDADE_FINAL = 250;
    public final Comprador COMPRADOR = new Comprador();
    private String carro;
    private String marca;


    @Override
    public String toString() {
        return "Carro{" +
                "carro='" + carro + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public final void imprime(){
        System.out.println("Imprimindo um carro");
    }

    public Comprador getCOMPRADOR() {
        return COMPRADOR;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
