package org.example.CajeroAutomatico;

import lombok.Data;

@Data
public class CuentaBancaria {

    private double saldo;

    public void retirarDinero(double dinero) {
        if (saldo < dinero) {
            throw new SaldoInsuficienteException("No puedes retirar más dinero del que tienes.");
        } else if (dinero>600) {
            throw new LimiteDiarioException("No se puede retirar más de 600 €");
        } else if (dinero <= 0) {
            throw new RuntimeException("No se puede retirar 0 o en negativo");
        }
        saldo -= dinero;
        System.out.println("Han sido retirado: " + dinero + " €");
    }

    public void ingresarDinero(double dinero) {
        if (dinero > 3000) {
            throw new DepositoMaximoException("No puedes ingresar más de 3000 pavinis.");
        } else if (dinero <= 0) {
            throw new RuntimeException("No se puede ingresar 0 o en negativo");
        }
        saldo += dinero;
    }






}
