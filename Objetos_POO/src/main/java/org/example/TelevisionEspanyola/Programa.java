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
        if (empleado.getCargo().equals("director")) {
            empleado.setCargo("pte");
        }
        empleado.setDirector(director);
        listaEmpleados.add(empleado);

    }

    public void invitadosTemporada(int temporada) {

        System.out.println("Los invitados que han ido a la temporada: " + temporada);
        int cont = 0;
        for (Invitado inv : listaInvitados) {
            if (inv.getTemporada() == temporada) {
                System.out.println("Nombre: " + inv.getNombre() + ", de profesión: " + inv.getProfesion());
                cont++;
            }
        }
        System.out.println("Hay un total de " + cont);
    }

    public int vecesInvitado(String nombre) {
        int cont = 0;
        for (Invitado inv : listaInvitados) {
            if (nombre.equals(inv.getNombre())){
                cont++;
            }
        }
        return cont;
    }

    public void rastrearInvitado(String nombre) {
        for (Invitado inv : listaInvitados) {
            if (inv.getNombre().equals(nombre)) {
                System.out.println("Fecha:" + inv.getFecha_visita() + " y temporada: " + inv.getTemporada());
            }
        }
    }

    public boolean buscarInvitado(String nombre) {
        for (Invitado inv : listaInvitados) {
            if (inv.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    public void invitadoAntes(String nombre) {
        if (buscarInvitado(nombre)) {

        }
    }


    public void agregarInvitado(String nombre, String profesion, int temporada) {

        Invitado invitado = new Invitado(nombre, profesion, temporada);
        listaInvitados.add(invitado);
        actualizarTemporadas();

    }

    private void actualizarTemporadas() {
        for (Invitado inv : listaInvitados) {
            if (getTemporadas() < inv.getTemporada()){
                setTemporadas(inv.getTemporada());
            }
        }
    }

    public Programa(String nombre, Cadena cadena, String nombreDirector) {
        this.nombre = nombre;
        this.temporadas = 0;
        this.cadena = cadena;
        listaEmpleados = new ArrayList<>();
        this.director = new Empleado(nombreDirector, "director");
        listaEmpleados.add(director);
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
                ", cadena=" + cadena.getNombre() +
                ", temporadas=" + temporadas +
                ", listaEmpleados=" + listaEmpleados +
                ", listaInvitados=" + listaInvitados +
                ", director=" + director +
                '}';
    }
}
