package org.example.EntornosJavaDoc;

import lombok.Data;

import java.util.ArrayList;
@Data
/**
 * @Author: Pol Gorrindo Bermejo
 * @Version: 1.0
 */
public class Usuario {

    private String nombre;
    private int idUsuario;
    private ArrayList<Libro> librosPrestados;

    /**
     * Constructor de Usuario donde es requerido el nombre (String) y el id (int),
     * también se inicializa la ArrayList de librosPrestados.
     * @param nombre
     * @param idUsuario
     */
    public Usuario(String nombre, int idUsuario) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
        librosPrestados = new ArrayList<>();
    }

    /**
     * Método para marcar un libro como prestado y quitarle la disponibilidad.
     * @param libro
     */
    public void prestarLibro(Libro libro) {
        if (libro.isDisponible()) {
            libro.prestarLibro();
            librosPrestados.add(libro);
        } else {
            System.out.println("Este libro no está disponible.");
        }
    }

    /**
     * Método para devolver el libro prestado y marcarlo como disponible,
     * además es quitado de la lista de libros prestados.
     * @param libro
     */
    public void devolverLibro(Libro libro) {
        if (!libro.isDisponible()) {
            libro.devolverLibro();
            librosPrestados.remove(libro);
        } else {
            System.out.println("Este libro ya está devuelto.");
        }
    }

    /**
     * Muestra por pantalla la lista de libros prestados por este usuario.
     */
    public void listarLibrosPrestados() {
        System.out.println(librosPrestados);
    }



}
