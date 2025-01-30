package org.example.casa;

public class Habitacion {
    private String nombre;
    private double metros4;


    public Habitacion(String nombre, double metros4) {
        this.nombre = nombre;
        this.metros4=metros4;
    }

    public String getNombre() {
        return nombre;
    }

    public double getMetros4() {
        return metros4;
    }

    public void setMetros4(double metros4) {
        this.metros4 = metros4;
    }

    @Override
    public String toString() {
        return "Habitación : [ nombre=" + getNombre() + " metros cuadrados= " + getMetros4();
    }
}
