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

    /**
     * Constructor vacío de Cadena.
     */
    public Cadena(){
        this.listaProgramas = new ArrayList<>();
    }

    /**
     * Constructor de Cadena con parámetros a introducir.
     * @param nombre
     */
    public Cadena(String nombre) {
        this.nombre = nombre;
        listaProgramas = new ArrayList<>();

    }

    /**
     * Método para agregar un programa a la cadena.
     * @param programa
     */
    public void agregarPrograma(Programa programa) {
        listaProgramas.add(programa);
        programa.setCadena(this);
    }

    /**
     * Método para borrar un programa existente DE la cadena.
     * @param programa
     */
    public void borrarPrograma(Programa programa) {
        listaProgramas.remove(programa);
        //A las malas descubrí que no puede introducirse un null, pero sí un nuevo objeto vacío y hace como null.
        programa.setCadena(new Cadena());
    }

    //Atributos de Cadena
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
