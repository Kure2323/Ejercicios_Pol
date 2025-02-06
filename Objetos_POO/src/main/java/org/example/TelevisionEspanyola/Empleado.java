package org.example.TelevisionEspanyola;

public class Empleado {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Empleado getDirector() {
        return director;
    }

    /**
     * Asigna un director, es prácticamente un set
     * @param director
     */
    public void asignarDirector(Empleado director) {
        this.director = director;
    }

    /**
     * Método para generar un ID por cada Empleado nuevo, va ligado a la cantidad de estos.
     * @return
     */
    public String generarID() {

        return String.format("EP%03d", ++cantidad);

    }

    /**
     * Comprueba que el cargo entra dentro de lo establecido y devuelve su valor si lo está,
     * en caso de no ser ninguno de ellos devuelve pte
     * @param cargo
     * @return
     */
    public String comprobarCargo(String cargo) {

        if (!cargo.equals("director") && !cargo.equals("técnico") && !cargo.equals("presentador") && !cargo.equals("colaborador"))
            return "pte";
        return cargo;

    }

    /**
     * Constructor con parámetros de Empleado
     * Llama a generarID() por cada empleado nuevo
     * El director se asignará cuando sea creado mediante Programa
     * @param nombre
     * @param cargo
     */
    public Empleado(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = comprobarCargo(cargo);
        id = generarID();
        this.director = null;
    }
    public Empleado(){
        id = generarID();
        this.director = null;
    }

    public static int getCantidad() {
        return cantidad;
    }

    /**
     * Atributos de Empleado incluyendo al director y la cantidad de Empleados totales.
     */
    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;
    private static int cantidad = 0;



    @Override
    public String toString() {
        return "Empleado{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", director=" + director;
    }
}
