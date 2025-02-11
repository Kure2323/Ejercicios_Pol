package org.example.herencia_vehiculo;

public class Avion extends Vehiculo{

    private int alas;

    public Avion(String marca, String matricula, int alas) {
        super(marca, matricula);
        this.alas=alas;
    }

    public void ruido() {
        System.out.println("brrr brrr");
    }
}
