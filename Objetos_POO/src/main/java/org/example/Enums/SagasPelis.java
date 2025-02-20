package org.example.Enums;

public enum SagasPelis {

    HARRYPOTTER(8),CREPUSCULO(4),SPIDERMAN(7),A_TODO_GAS(12),SHREK(6);

    private int nro_pelis;

    SagasPelis(int nro_pelis) {
        this.nro_pelis=nro_pelis;
    }

    public int getNro_pelis() {
        return nro_pelis;
    }

}
