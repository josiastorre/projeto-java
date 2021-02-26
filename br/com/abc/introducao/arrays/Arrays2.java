package br.com.abc.introducao.arrays;

public class Arrays2 {
    public static void main(String[] args) {
        // byte, short, int, long, float, double = 0
        // char '\u0000' ' '
        // boolean = false;
        //reference = null
        String[] nomes = new String[4];
        nomes[0] = "Naruto";
        nomes[1] = "Goku";
        nomes[2] = "Luffy";
        nomes[3] = "Kurosaki";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println((i + 1) + " - nome - " + nomes[i]);
        }
    }
}
