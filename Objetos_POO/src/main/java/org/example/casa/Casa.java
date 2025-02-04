package org.example.casa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Casa {
    Scanner in = new Scanner(System.in);
    private String direccion;

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    private List<Habitacion> habitaciones; // COMPOSICIÓN: la Casa tiene habitaciones

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario() {

        System.out.println("Inserte propietari@: ");
        String nombre = in.next();
        System.out.println("Edad del propietari@: ");
        int edad = in.nextInt();

        propietario = new Propietario(nombre, edad);
    }

    private Propietario propietario;

    public Casa(String direccion) {
        this.direccion = direccion;
        setPropietario();
        this.habitaciones = new ArrayList<>();
    }



    public void agregarHabitacion(String nombre, double metros4) {

        for (Habitacion hab : habitaciones){
            if (hab.getNombre().equals(nombre)) {
                System.out.println("La habitación ya existe");
                return;
            }
        }
        Habitacion habitacion = new Habitacion(nombre, metros4); //solamente la Casa crea las habitaciones
        habitaciones.add(habitacion);

    }

    public void mostrarHabitaciones() {
        System.out.println("Casa en " + direccion + " tiene en total " + habitaciones.size() + " habitaciones.");
        for (Habitacion hab : habitaciones) {
            System.out.println("- " + hab.getNombre() + " (" + hab.getMetros4() + " m2)");
        }
        System.out.println("El propietari@ de la casa es: " + propietario.getNombre() + " de años: " + propietario.getEdad());
    }

    public Habitacion getHabitacionMasGrande() {

        Habitacion mayor = habitaciones.get(0);

        for (Habitacion hab : habitaciones){

            if (hab.getMetros4() > mayor.getMetros4()){
                mayor=hab;
            }

        }

        return mayor;
    }

    public void eliminarHabitacion(String nombre){

        for (Habitacion hab : habitaciones) {
            if (nombre.equals(hab.getNombre())) {
                habitaciones.remove(hab);
                return;
            }
        }

    }



}
