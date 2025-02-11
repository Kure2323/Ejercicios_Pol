package org.example.EntornosJavaDoc;

import lombok.Data;

@Data
/**
 * @Author Pol Gorrindo Bermejo
 * @Version 1.0
 */
public class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponible;

    /**
     * Constructor de Libro formado por el título, el autor y el año de publicación de este,
     * además por defecto este estará disponible para ser prestado.
     * @param titulo
     * @param autor
     * @param anioPublicacion
     */
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        disponible = true;
    }

    /**
     * Cambia la disponibilidad del libro a 'no disponible'.
     */
    public void prestarLibro() {
        disponible = false;
    }

    /**
     * Cambia la disponibilidad del libro a 'disponible'.
     */
    public void devolverLibro() {
        disponible = true;
    }

    /**
     * Muestra por pantalla la información entera del libro, incluyendo su disponibilidad y año de publicación.
     * @return
     */
    public String mostrarInformacion() {
        return "Título=" + this.getTitulo() + ", autor=" + this.getAutor() + ", año de publicación=" + this.getAnioPublicacion() + ", disponibilidad=" + this.isDisponible();
    }


}
