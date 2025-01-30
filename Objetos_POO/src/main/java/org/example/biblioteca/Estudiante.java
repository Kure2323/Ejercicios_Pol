package org.example.biblioteca;

import java.util.ArrayList;

public class Estudiante {


    public static int contadorEstudiantes = 0;

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", curso='" + curso + '\'' +
                ", nia=" + nia +
                ", email='" + email + '\'' +
                ", librosPrestados=" + librosPrestados +
                '}';
    }

    private String nombre;
    private String curso;
    private int nia;
    private String email;
    private ArrayList<Libro> librosPrestados;


    public ArrayList<Libro> getLibrosPrestados() {

        return librosPrestados;

    }

    public void setLibrosPrestados(ArrayList<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public Estudiante(String nombre){
        this.nombre=nombre;
        contadorEstudiantes++;
        nia=contadorEstudiantes;
        librosPrestados = new ArrayList<>();
    }

    public Estudiante (String nombre, String curso, String email) {

        this.nombre=nombre;
        this.curso=curso;
        this.email=email;
        contadorEstudiantes++;
        this.nia=contadorEstudiantes;
        librosPrestados = new ArrayList<>();

    }

    public String getNombre() {
        return this.nombre;
    }

    public String getCurso() {
        return this.curso;
    }

    public int getNia() {
        return this.nia;
    }
    public String getEmail() {
        return this.email;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setNia(int nia) {
        this.nia = nia;
    }
    public void setEmail(String email) {
        this.email = email;
    }



    public static int obtenerTotalEstudiantes() {
        return contadorEstudiantes;
    }


    public void anyadirLibro(Libro libro){
        librosPrestados.add(libro);
    }
    public void eliminarLibro(Libro libro){
        librosPrestados.remove(libro);
    }

}
