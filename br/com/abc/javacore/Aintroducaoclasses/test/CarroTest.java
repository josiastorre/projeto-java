package br.com.abc.javacore.Aintroducaoclasses.test;

import br.com.abc.javacore.Aintroducaoclasses.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.placa = "DHL:3235";
        carro.modelo = "Verona";
        carro.velocidadeMaxima = 120F;
        System.out.println("A placa do veículo é: " + carro.placa);
        System.out.println("O modelo do carro é: "+ carro.modelo);
        System.out.println("A velocidade máxima do veículo é: "+carro.velocidadeMaxima);
    }

}
