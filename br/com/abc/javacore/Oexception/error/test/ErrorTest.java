package br.com.abc.javacore.Oexception.error.test;

public class ErrorTest {
    public static void main(String[] args) {
        stackoverflowError();
    }
    public static void stackoverflowError() {
        stackoverflowError();
    }
}

