package org.example;

public class Estudiante {


    public static int contadorEstudiantes = 0;

    private String nombre;
    private String curso;
    private int nia;
    private String email;

    public Estudiante(String nombre){
        this.nombre=nombre;
        contadorEstudiantes++;
    }

    public Estudiante (String nombre, String curso, String email) {

        this.nombre=nombre;
        this.curso=curso;
        this.email=email;
        contadorEstudiantes++;
        this.nia=contadorEstudiantes;

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

    @Override
    public String toString() {
        return "Alumno: " + this.nombre + " curso: " + this.curso + " nia " + this.nia + " email: " + this.email;

    }

    public static int obtenerTotalEstudiantes() {
        return contadorEstudiantes;
    }

}
