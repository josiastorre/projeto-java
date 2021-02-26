package br.com.abc.javacore.Oexception.customexceptions;

public class LoginInvalidException extends Exception {

    public LoginInvalidException(){
        super("Usuário ou senha inválidos");
    }
}
