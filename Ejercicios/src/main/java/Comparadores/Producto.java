package Comparadores;

public class Producto implements Comparable<Producto>{

    private String nombre;
    private Integer precio;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public int compareTo(Producto o) {

        int compararNombre = nombre.compareTo(o.nombre);

        if (compararNombre != 0) {
            return compararNombre;
        }

        return precio.compareTo(o.precio);
    }
}
