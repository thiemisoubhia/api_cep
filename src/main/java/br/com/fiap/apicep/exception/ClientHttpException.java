package br.com.fiap.apicep.exception;

public class ClientHttpException extends RuntimeException{
    public ClientHttpException(String message){
        super(message);
    }
}
