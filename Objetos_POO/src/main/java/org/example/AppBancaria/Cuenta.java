package org.example.AppBancaria;

import lombok.Data;

@Data
public class Cuenta {

    private static int cantidad = 0;
    private String iban;
    private Cliente titular;
    private double saldo;

    public Cuenta() {
        saldo = 0;
        titular = null;
        iban = generarIban();
    }

    private String generarIban() {
        return String.format("ES%03d", ++cantidad);
    }

}
