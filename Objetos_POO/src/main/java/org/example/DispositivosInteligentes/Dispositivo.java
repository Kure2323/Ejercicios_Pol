package org.example.DispositivosInteligentes;

import lombok.Data;

@Data
public abstract class Dispositivo {

    private String nombre;
    private boolean estado; //encendido/apagado

    public Dispositivo(String nombre) {
        this.nombre=nombre;
        estado = false;
    }

    public abstract void encender();

    public void apagar(){
        if (!estado) {
            System.out.println(nombre + " ya está apagado.");
        } else {
            estado = false;
            System.out.println(nombre + " apagado.");
        }
    }

    public void mostrarEstado() {
        if (estado) {
            System.out.println(nombre + " está encendido.");
        } else {
            System.out.println(nombre + " está apagado.");
        }
    }





}
