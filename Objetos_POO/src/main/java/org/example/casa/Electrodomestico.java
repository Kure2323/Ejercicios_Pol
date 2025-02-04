package org.example.casa;

public class Electrodomestico {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    private String nombre;
    private double consumo;

    public Electrodomestico(String nombre, double consumo){
        this.nombre=nombre;
        this.consumo=consumo;
    }



}
