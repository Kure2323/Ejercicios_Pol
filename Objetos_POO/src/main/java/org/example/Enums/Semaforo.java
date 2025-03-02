package org.example.Enums;

public enum Semaforo {

    AMARILLO,ROJO,VERDE;

    private static int contador = 0;

    public Semaforo siguiente() {
        switch (contador){
            case 0:
                contador++;
                return AMARILLO;
            case 1:
                contador++;
                return ROJO;
            case 2:
                contador=0;
                return VERDE;
            default:
                return ROJO;
        }
    }

}
