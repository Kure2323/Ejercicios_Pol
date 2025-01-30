package org.example.casa;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    private String direccion;
    private List<Habitacion> habitaciones; // COMPOSICIÓN: la Casa tiene habitaciones

    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
    }

    public void agregarHabitacion(String nombre, double metros4) {
        Habitacion habitacion = new Habitacion(nombre, metros4); //solamente la Casa crea las habitaciones
        habitaciones.add(habitacion);
    }

    public void mostrarHabitaciones() {
        System.out.println("Casa en " + direccion + " tiene las siguientes habitaciones: " + habitaciones);
    }
}
