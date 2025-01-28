package org.example;

public class Libro {

    public static int numlibro = 0;
    public static int displibro = 0;
    final static String LIB = "LIB";
    private final static boolean DISP_DEF = true;

    private String titulo;
    private String autor;
    private String id; //A modificar
    private boolean disponible=DISP_DEF;
    private Editorial editorial;

    public Estudiante getEstudiantePrestado() {
        return estudiantePrestado;
    }

    public void setEstudiantePrestado(Estudiante estudiantePrestado) {
        this.estudiantePrestado = estudiantePrestado;
    }

    private Estudiante estudiantePrestado;


    public Libro (String titulo, String autor, Editorial editorial) {
        this.titulo=titulo;
        this.autor=autor;
        id=calcularId();
        numlibro++;
        disponible=DISP_DEF;
        displibro++;
        estudiantePrestado = null;
        this.editorial=editorial;
    }


    public static int librosDisponibles() {
        return displibro;
    }
    public static int cantidadLibros() {
        return numlibro;
    }

    public String calcularId() {
        return String.format("LIB%03d",numlibro);
    }

    public void prestar(Estudiante estudiante) {

        if (disponible && estudiante.getLibroPrestado() == null) {
            displibro--;
            disponible = false;
            estudiantePrestado = estudiante;
            System.out.println("El libro ha sido prestado con éxito");
            estudiante.setLibroPrestado(this);

        } else if (estudiante.getLibroPrestado() != null) {
            System.out.println("El estudiante " + estudiante.getNombre() + " ya tiene un libro prestado.");
        } else {
            System.out.println("El libro " + getTitulo() + " se puede prestar porque no está disponible");
        }
    }

    public void devolver() {
        if (!disponible) {
            displibro++;
            System.out.println("El libro ha sido devuelto con éxito por: " + estudiantePrestado.getNombre());
            disponible=true;
            estudiantePrestado=null;
        } else {
            System.out.println("El libro no se puede devolver porque no ha sido prestado");
        }
    }

    public static int getTotalLibros() {
        return numlibro;
    }

    public static int getLibrosDisponibles() {
        return displibro;
    }

    public void estaDisponible() {

        if (disponible==true) {
            System.out.println("El libro está disponible");
        } else {
            System.out.println("El libro no está disponible");
        }

    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getId() {
        return id;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public void setAutor(String autor){
        this.autor=autor;
    }

    public void setDisponible(boolean disponible){
        this.disponible=disponible;
    }

    @Override
    public String toString(){

        return "Libro: [Título= " + getTitulo() + " Autor= " + getAutor() + " ID= " + getId() + " ¿Está disponible? " + getDisponible() + " estudiante=" + estudiantePrestado.getNombre() + " editorial=" + editorial.getNombre() + " ]";

    }



}