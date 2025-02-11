package org.example.EntornosJavaDoc;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@Data
@NoArgsConstructor
/**
 * @Author Pol Gorrindo Bermejo
 * @Version 1.0
 */
public class Biblioteca {

    private ArrayList<Libro> catalogo = new ArrayList<>();
    private ArrayList<Usuario> usuariosRegistrados = new ArrayList<>();

    /**
     * Método para agregar un libro al catálogo de la biblioteca,
     * además comprueba si este ya existe en dicho catálogo,
     * si así sea, no lo agregará
     * @param libro
     */
    public void agregarLibro(Libro libro) {
        for (Libro lib : catalogo) {
            if (lib.getTitulo().equals(libro.getTitulo()) && lib.getAutor().equals(libro.getAutor())) {
                System.out.println("Este libro ya está en el catálogo.");
                return;
            }
        }
        catalogo.add(libro);
    }

    /**
     * Método para registrar un nuevo usuario a la biblioteca,
     * además realiza una comprobación sobre los usuarios ya registrados,
     * en caso de haber alguna coincidencia en la id, no es introducido.
     * @param usuario
     */
    public void registrarUsuario(Usuario usuario) {
        for (Usuario usr : usuariosRegistrados) {
            if (usr.getIdUsuario() == usuario.getIdUsuario()) {
                System.out.println("Este usuario ya está registrado");
                return;
            }
        }
        usuariosRegistrados.add(usuario);
    }

    /**
     * Método que busca en el catáloco de la biblioteca el título
     * introducido y lo devuelve, en caso de no encontrarlo devuelve null.
     * @param titulo
     * @return
     */
    public Libro buscarLibro(String titulo) {
        for (Libro lib : catalogo) {
            if (lib.getTitulo().equals(titulo)) {
                return lib;
            }
        }
        return null;
    }

    /**
     * Método que muestra por pantalla el catálogo entero de la biblioteca.
     */
    public void mostrarCatalogo() {
        System.out.println(catalogo);
    }




}
