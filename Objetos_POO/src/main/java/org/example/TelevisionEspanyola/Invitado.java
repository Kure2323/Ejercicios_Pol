package org.example.TelevisionEspanyola;

import java.time.LocalDate;
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

    public Invitado(String nombre, String profesion, int temporada) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.fecha_visita = pedirFecha();
        this.temporada = temporada;
    }

    private LocalDate pedirFecha() {
        System.out.println("Introduce el año en el que acudirá el invitado " + this.getNombre() + ":");
        int anyo = in.nextInt();
        System.out.println("Introduce el mes:");
        int mes = in.nextInt();
        System.out.println("Introduce el día:");
        int dia = in.nextInt();
        return LocalDate.of(anyo,mes,dia);
    }

    private String nombre;
    private String profesion;
    private LocalDate fecha_visita;
    private int temporada;

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
