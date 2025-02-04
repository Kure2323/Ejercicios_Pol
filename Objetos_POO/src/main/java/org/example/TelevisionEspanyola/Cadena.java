package org.example.TelevisionEspanyola;

import java.util.ArrayList;

public class Cadena {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Programa> getListaProgramas() {
        return listaProgramas;
    }

    public void setListaProgramas(ArrayList<Programa> listaProgramas) {
        this.listaProgramas = listaProgramas;
    }

    public Cadena(){
        this.listaProgramas = new ArrayList<>();
    }

    public Cadena(String nombre) {
        this.nombre = nombre;
        this.listaProgramas = new ArrayList<>();

    }

    public void agregarPrograma(Programa programa) {
        listaProgramas.add(programa);
    }

    private String nombre;
    private ArrayList<Programa> listaProgramas;

    @Override
    public String toString() {
        return "Cadena{" +
                "nombre='" + nombre + '\'' +
                ", listaProgramas=" + listaProgramas +
                '}';
    }
}
