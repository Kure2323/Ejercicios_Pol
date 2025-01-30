package org.example;

import java.util.ArrayList;

public class Equipo {

    public ArrayList<Persona> getComponentes() {
        return componentes;
    }

    public void setComponentes(ArrayList<Persona> componentes) {
        this.componentes = componentes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String nombre;
    private ArrayList<Persona> componentes;

    public Equipo(String nombre) {
        this.nombre = nombre;
        componentes=new ArrayList<>();
    }

    @Override
    public String toString(){
        return "Equipo : [Nombre= " + getNombre() + " componentes= " + getComponentes() + " ]";
    }

    public void anyadirComponente(Persona persona){
        componentes.add(persona);
    }
    public void eliminarComponente(Persona persona){
        componentes.remove(persona);
    }

}
