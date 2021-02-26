package br.com.abc.javacore.Sstrings.test;

public class StringTest {
    public static void main(String[] args) {
        String nome = "Josias";
        nome = nome.concat(" Pinto"); // nome += "Pinto";
        String nome2 = "Josias";
        String nome3 = new String(" Iraci"); // 1-Variável de referência, 2-Um objeto do tipo String, 3-Uma String no pool de String

        String teste = "Goku";
        String teste2 = "           0123456789            ";
        System.out.println(teste.charAt(2));
        System.out.println(teste.equalsIgnoreCase(teste2));
        System.out.println(teste.length());
        System.out.println(teste2.replace('a','o'));
        System.out.println(teste2.toLowerCase());
        System.out.println(teste2.toUpperCase());
        System.out.println(teste2.substring(0,8));
        System.out.println(teste2.trim());
    }
}
