package org.example.Ejercicio5;

import java.io.Serializable;

public class Empleado implements Serializable {
    private String nombre;
    private int salario;

    public Empleado(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                '}';
    }
}
