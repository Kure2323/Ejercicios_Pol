package org.example.casa;

public class Propietario {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    private String nombre;
    private int edad;

    public Propietario(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }


}
