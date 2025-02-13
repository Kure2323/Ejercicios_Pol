package org.example.Festival;

public class Organizador extends Persona{

    private String rol;

    public Organizador(String nombre, int edad, String rol) {
        super(nombre, edad);
        this.rol = rol;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Rol: " + rol);
    }

    public void accederEvento() {
        System.out.println("Accediendo al evento como Organizador: Coordinando el evento.");
    }

}
