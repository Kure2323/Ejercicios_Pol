package org.example.TelevisionEspanyola;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Invitado {
    Scanner in = new Scanner(System.in);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    public void setFecha_visita(LocalDate fecha_visita) {
        this.fecha_visita = fecha_visita;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    /**
     * Constructor de Invitado con parámetros y la fecha es pedida mediante el método pedirFecha()
     * @param nombre
     * @param profesion
     * @param temporada
     */
    public Invitado(String nombre, String profesion, int temporada) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.fecha_visita = pedirFecha();
        this.temporada = temporada;

    }

    /**
     * Pide al usuario la fecha de aparición de un invitado al programa.
     * @return
     */
    private LocalDate pedirFecha() {
        System.out.println("Introduce el año en el que acudirá el invitado " + this.getNombre() + ":");
        int anyo = in.nextInt();
        System.out.println("Introduce el mes:");
        int mes = in.nextInt();
        System.out.println("Introduce el día:");
        int dia = in.nextInt();
        return LocalDate.of(anyo,mes,dia);
    }

    public ArrayList<Programa> getListaProgramas() {
        return listaProgramas;
    }

    public void setListaProgramas(ArrayList<Programa> listaProgramas) {
        this.listaProgramas = listaProgramas;
    }

    /**
     * Atributos de Invitado
     */
    private String nombre;
    private String profesion;
    private LocalDate fecha_visita;
    private int temporada;
    private ArrayList <Programa> listaProgramas;

    @Override
    public String toString() {
        return "Invitado{" +
                "nombre='" + nombre + '\'' +
                ", profesion='" + profesion + '\'' +
                ", fecha_visita=" + fecha_visita +
                ", temporada=" + temporada +
                '}';
    }

}
