package org.example.Ejercicio5;

public class Jefe extends Empleado{
    private String departamento;

    public Jefe(String nombre, int salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Jefe{" +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}
