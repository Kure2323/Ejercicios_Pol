package org.example.Ejercicio1;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private int edad;
    private transient String dni; // Este campo no se serializará

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", DNI: " + dni;
    }

}
