package org.example.Festival;

public class Persona {
    String nombre;
    int edad;
    private static final int EDAD_MIN = 18;

    public Persona(String nombre, int edad) throws EdadMinimaException {
        this.nombre = nombre;
        setEdad(edad);
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void accederEvento() {
        System.out.println("Accediendo al evento...");
    }

    public void setEdad(int edad) throws EdadMinimaException {

        if (edad < EDAD_MIN) {
            throw new EdadMinimaException("No puede crear a una persona menor de edad");
        }

    }


}
