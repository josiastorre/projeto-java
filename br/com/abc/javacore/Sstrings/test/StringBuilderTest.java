package br.com.abc.javacore.Sstrings.test;

public class StringBuilderTest {
    public static void main(String[] args) {
        String s = "Uma frase comum";
        StringBuffer sb = new StringBuffer(16);
        sb.append("def").insert(3,"ghi").reverse().delete(2,3);
        System.out.println(sb);
    }
}
