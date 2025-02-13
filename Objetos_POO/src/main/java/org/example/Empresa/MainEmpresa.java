package org.example.Empresa;

public class MainEmpresa {


    public static void main(String[] args) {
        Empleado[] listaEmpleados = {
                new Disenyador(),
                new Desarrollador(),
                new Gerente()
        };
        System.out.println("=== Usando el array polimórfico ===");
        for (int i = 0; i < listaEmpleados.length; i++) {
            listaEmpleados[i].realizarTarea();
        }

        Empleado gerente = new Gerente();
        Empleado desarrollador = new Desarrollador();

        System.out.println();

        System.out.println("=== Usando el método asignarTarea() ===");
        asignarTarea(gerente);
        asignarTarea(desarrollador);



    }

    public static void asignarTarea(Empleado empleado) {
        System.out.println("Asignando tarea al empleado...");
        empleado.realizarTarea();
    }


}
