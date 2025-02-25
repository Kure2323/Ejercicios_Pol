package org.example.PracticaFurbo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.OutputStream;
@Getter @Setter
public class Acompanyante extends MutxamelFC{

    private Jugador integrante;
    private String parentesco;

    public Acompanyante(String nombre, int edad,
                        Jugador integrante, String parentesco) {
        super(nombre, edad);
        this.integrante=integrante;
        this.parentesco=parentesco;
    }

    public void animarEquipo() {
        System.out.println("El acompañante " + getNombre() + " está animando al equipo!!! UUOOOOOOHHHH!!!");
    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " concentrándose en el partido...");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("Viajando a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("TREMENDO GOLAZZOOOOOO!!");
    }

    @Override
    public String toString() {
        return "Acompañante(" + getNombre() + " de edad=" +
                getEdad() + ", integrante=" + integrante +
                ", parentesco=" + parentesco + ")";
    }
}
