package org.example.TelevisionEspanyola;

import java.util.ArrayList;

public class Programa {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    public void setListaInvitados(ArrayList<Invitado> listaInvitados) {
        this.listaInvitados = listaInvitados;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    public void agregarEmpleado(String nombre, String cargo) {
        Empleado empleado = new Empleado(nombre, cargo);
        empleado.setDirector(director);
        listaEmpleados.add(empleado);

    }

    public Programa() {
        temporadas = 0;
        listaEmpleados = new ArrayList<>();
        director = new Empleado(null,"director");
        listaEmpleados.add(director);
        listaInvitados = new ArrayList<>();
        cadena = null;
    }

    public Programa(String nombre,int temporadas, String nombreDirector) {
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = temporadas;
        listaEmpleados = new ArrayList<>();
        this.director = new Empleado(nombreDirector, "director");
        listaInvitados = new ArrayList<>();
    }

    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;


    @Override
    public String toString() {
        return "Programa{" +
                "nombre='" + nombre + '\'' +
                ", cadena=" + cadena +
                ", temporadas=" + temporadas +
                ", listaEmpleados=" + listaEmpleados +
                ", listaInvitados=" + listaInvitados +
                ", director=" + director +
                '}';
    }
}
