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

    /**
     * Añade un empleado creado a partir de lo introducido y lo añade a la lista de empleados del programa.
     * También realiza una pequeña verificación de que no sea director y le asigna de director el del programa.
     * @param nombre
     * @param cargo
     */
    public void agregarEmpleado(String nombre, String cargo) {

        Empleado empleado = new Empleado(nombre, cargo);
        if (empleado.getCargo().equals("director")) {
            empleado.setCargo("pte");
        }
        empleado.asignarDirector(director);
        listaEmpleados.add(empleado);

    }

    public void eliminarEmpleado(String nombre, String cargo) {
        for (Empleado emp : listaEmpleados) {
            if (emp.getNombre().equals(nombre) && emp.getCargo().equals(cargo)) {
                listaEmpleados.remove(emp);
                return;
            }
        }
    }

    /**
     * Muestra los invitados que han ido por la temporada introducida.
     * Recorre la lista y muestra aquellos cuya temporada de aparición coincida con la introducida.
     * @param temporada
     */
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

    /**
     * Contabiliza la cantidad de veces que aparece en la lista de invitados el mismo nombre.
     * Recorre la lista de invitados en busca de similitud con el nombre y suma al contador.
     * @param nombre
     * @return
     */
    public int vecesInvitado(String nombre) {
        int cont = 0;
        for (Invitado inv : listaInvitados) {
            if (nombre.equals(inv.getNombre())){
                cont++;
            }
        }
        return cont;
    }

    /**
     * Método para mostrar el invitado introducido, sus diferentes apariciones con fecha y temporada.
     * Realizado recorrienfo la lista de invitados, comparando el nombre
     * y obteniendo la fecha y la temporada con los getters.
     * @param nombre
     */
    public void rastrearInvitado(String nombre) {
        for (Invitado inv : listaInvitados) {
            if (inv.getNombre().equals(nombre)) {
                System.out.println("Fecha:" + inv.getFecha_visita() + " y temporada: " + inv.getTemporada());
            }
        }
    }

    /**
     * Método boolean que verifica la existencia de un invitado por el nombre.
     * Recorre la lista de invitados hasta dar con él y devolver true, o por
     * el caso contrario no encontrar nada y devolver false.
     * @param nombre
     * @return
     */
    public boolean buscarInvitado(String nombre) {
        for (Invitado inv : listaInvitados) {
            if (inv.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Un vago y fallido intento.
     * No se me ocurre otra forma que introducir o crear otro programa y no es como se pide.
     * @param nombre
     */
    public void invitadoAntes(String nombre) {
        if (buscarInvitado(nombre)) {

        }
    }

    /**
     * Método para crear y agregar un Invitado a la lista del programa.
     * @param nombre
     * @param profesion
     * @param temporada
     */
    public void agregarInvitado(String nombre, String profesion, int temporada) {

        Invitado invitado = new Invitado(nombre, profesion, temporada);
        listaInvitados.add(invitado);
        actualizarTemporadas();

    }
    public void eliminarInvitado(String nombre, String profesion, int temporada) {
        for (Invitado inv : listaInvitados) {
            if (inv.getNombre().equals(nombre) && inv.getProfesion().equals(profesion) && inv.getTemporada() == temporada) {
                listaInvitados.remove(inv);
                return;
            }
        }
    }

    /**
     * Método para actualizar la cantidad de temporadas a la del invitado con la aparición en la temporada más nueva.
     * Recorro la lista de invitados y le asigno la temporada más reciente.
     */
    private void actualizarTemporadas() {
        for (Invitado inv : listaInvitados) {
            if (getTemporadas() < inv.getTemporada()){
                setTemporadas(inv.getTemporada());
            }
        }
    }

    /**
     * Constructor de Programa donde también es creado el director y añadido a la lista de empleados.
     * @param nombre
     * @param nombreDirector
     */
    public Programa(String nombre, String nombreDirector) {
        this.nombre = nombre;
        this.temporadas = 0;
        cadena = new Cadena();
        listaEmpleados = new ArrayList<>();
        this.director = new Empleado(nombreDirector, "director");
        listaEmpleados.add(director);
        listaInvitados = new ArrayList<>();
    }

    /**
     * Atributos de Programa
     */
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
