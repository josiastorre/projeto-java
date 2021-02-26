package br.com.abc.javacore.Rwrappers.test;

public class WrappersTest {
    public static void main(String[] args) {
    byte bytePrimitivo = 1;
    short shortPrimitivo = 1;
    int intPrimitivo = 10;
    long longPrimitivo = 10;
    float floatPrimitivo = 10;
    double doublePrimitivo = 10;
    char charPrimitivo = 'A';
    boolean booleanPrimitivo = true;

    Byte byteWrapper = 1;
    Short shortWrapper = 1;
    Integer integerWrapper = new Integer("10");
    Long longWrapper = Long.valueOf("10");
    Float floatWrapper = new Float("10");
    Double doubleWrapper = 10D;
    Character characterWrapper = 'A';
    Boolean booleanWrapper = new Boolean("true");

        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetter('A'));
        System.out.println(Character.isLetterOrDigit('1'));
        System.out.println(Character.isUpperCase('L'));
        System.out.println(Character.isLowerCase('l'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));
    }
}
