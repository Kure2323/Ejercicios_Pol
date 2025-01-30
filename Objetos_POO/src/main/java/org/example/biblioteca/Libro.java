package org.example.biblioteca;

public class Libro {

    public static int numlibro = 0;
    public static int displibro = 0;
    final static String LIB = "LIB";
    private final static boolean DISP_DEF = true;

    @Override
    public String toString() {
        if (estudiantePrestado != null)
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", id='" + id + '\'' +
                ", disponible=" + disponible +
                ", editorial=" + editorial.getNombre() +
                ", estudiantePrestado=" + estudiantePrestado.getNombre() +
                '}';
        else {
            return "Libro{" +
                    "titulo='" + titulo + '\'' +
                    ", autor='" + autor + '\'' +
                    ", id='" + id + '\'' +
                    ", disponible=" + disponible +
                    ", editorial=" + editorial.getNombre();
        }
    }

    private String titulo;
    private String autor;
    private String id; //A modificar
    private boolean disponible=DISP_DEF;
    private Editorial editorial;
    private Estudiante estudiantePrestado;


    public Estudiante getEstudiantePrestado() {
        return estudiantePrestado;
    }

    public void setEstudiantePrestado(Estudiante estudiantePrestado) {
        this.estudiantePrestado = estudiantePrestado;
    }


    public Libro (String titulo, String autor, Editorial editorial) {
        this.titulo=titulo;
        this.autor=autor;
        id=calcularId();
        numlibro++;
        disponible=DISP_DEF;
        displibro++;
        estudiantePrestado = null;
        this.editorial=editorial;
        editorial.anyadirLibro(this);
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

    public Prestamo prestar(Estudiante estudiante) {

        if (disponible && !estudiante.getLibrosPrestados().contains(this)) {
            displibro--;
            disponible = false;
            estudiantePrestado = estudiante;
            System.out.println("El libro ha sido prestado con éxito");
            estudiante.anyadirLibro(this);
            Prestamo prestamo = new Prestamo(estudiante, this);
            System.out.println("Se ha generado el préstamo " + prestamo);
            return prestamo;
        } else if (estudiante.getLibrosPrestados().contains(this)) {
            System.out.println("El estudiante " + estudiante.getNombre() + " ya tiene el libro prestado.");
        } else {
            System.out.println("El libro " + getTitulo() + " no se puede prestar porque no está disponible");
        }
        return null;
    }

//    public Prestamo getPrestamo(Prestamo prestamo) {
//        return prestamo;
//    }

    public void devolver(Estudiante estudiante) {
        if (!disponible) {
            displibro++;
            System.out.println("El libro ha sido devuelto con éxito por: " + estudiantePrestado.getNombre());
            disponible=true;
            estudiantePrestado=null;
            estudiante.eliminarLibro(this);
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





}