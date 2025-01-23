package org.example;

public class Persona {

    private String nombre;
    private String apelllido;
    private String dni;
    private int peso;
    private int edad;
    private String residencia;
    private String profesion;

    public Persona() {
    }

    public Persona(String nombre, String apelllido, String dni, int peso, int edad, String residencia, String profesion) {

        this.nombre = nombre;
        this.apelllido = apelllido;
        this.dni = dni;
        this.peso = peso;
        this.edad = edad;
        this.residencia = residencia;
        this.profesion = profesion;
    }

    public String getNombre() {
        return this.nombre;
    }
    public String getApelllido() {
        return this.apelllido;
    }
    public String getDni() {
        return this.dni;
    }
    public int getPeso() {
        return this.peso;
    }
    public int getEdad() {
        return this.edad;
    }
    public String getResidencia() {
        return this.residencia;
    }
    public String getProfesion() {
        return this.profesion;
    }

    public void setNombre(String nombre) {
        if (!nombre.equalsIgnoreCase("Messi")) {
            this.nombre = nombre;
        }
    }
    public void setApelllido(String apelllido) {
        this.apelllido = apelllido;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setResidencia(String residencia) {
        this.residencia= residencia;
    }
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }


    public String concatenar() {

        return this.nombre + " " + this.apelllido;

    }

    @Override
    public String toString() {
        return this.nombre + " " + this.apelllido + " " + this.dni + " " + this.peso + " " + this.edad;

    }



}
