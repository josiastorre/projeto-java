package br.com.abc.javacore.Uexpressoesregulares.test;

public class TokenTest {
    public static void main(String[] args) {
        String str = " Josias1 Eduardo2 Rubia3 Larissa4 Kaio5 Wesley6 Carol7";
        String[] tokens = str.split("\\d");
        for(String arr : tokens) {
            System.out.println(arr.trim());
        }

    }
}
