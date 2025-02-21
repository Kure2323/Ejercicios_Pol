package org.example.CajeroAutomatico;

public class SaldoInsuficienteException extends RuntimeException{

    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }

}
